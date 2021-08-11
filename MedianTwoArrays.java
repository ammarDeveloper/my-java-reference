/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

    The overall run time complexity should be O(log (m+n)).


    Input: nums1 = [1,3], nums2 = [2]

    Output: 2.00000
    
    Explanation: merged array = [1,2,3] and median is 2
 
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class MedianTwoArrays {

    public static int gap(int gap) {
        if(gap <= 1){
            return 0;
        }
        return (gap/2)+(gap%2);
    }


    public static int[] merge(int nums1[], int num2[], int n, int m) {
        int gap = n + m;
        int i = 0;
        int j = 0;
        int retArr[] = new int[n+m];

        for(gap = gap(gap); gap > 0; gap = gap(gap)){
            
            for(i = 0; gap+i < n; i++){
                if(nums1[i] > nums1[gap+i]){
                    int temp = nums1[i];
                    nums1[i] = nums1[i+gap];
                    nums1[i+gap] = temp;
                }
            }

            for(j = gap>n ? gap-n:0; j < m && i < n; i++, j++){
                if(nums1[i] > num2[j]){
                    int temp = nums1[i];
                    nums1[i] = num2[j];
                    num2[j] = temp;
                }
            }

            if(j < m){
                for(j = 0; j+gap < m; j++){
                    if(num2[j] > num2[j+gap]){
                        int temp = num2[j];
                        num2[j] = num2[j+gap];
                        num2[j+gap] = temp;
                    }
                }

            }
        }
        int x = 0;
        for(int y = 0; y < n+m; y++, x++){
            if(y < n){
                retArr[x] = nums1[y];
            } else {
                retArr[x] = num2[y-n];
            }
        }

        return retArr;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums1[] = new int[n];
        for(int i = 0; i < n; i++){
            nums1[i] = input.nextInt();
        }

        int m = input.nextInt();
        int num2[] = new int[m];
        for(int i = 0; i < m; i++){
            num2[i] = input.nextInt();
        }

        input.close();
        int sort[] = merge(nums1, num2, n, m);
        DecimalFormat df = new DecimalFormat("#.00000");

        double mid = Math.ceil(((double)n + (double)m)/2-1);

        if(sort.length%2 == 0){
            System.out.println(df.format((double)(sort[(int)mid] + sort[(int)mid+1])/2));
        } else {
            System.out.println(df.format((double)sort[(int)mid]));
        }

        if((n+m)%2==0){
            if(mid>n){
                System.out.println(df.format((double)(num2[(int)mid]+num2[(int)mid+1])/2));
            } else {
                int a = nums1[(int)mid];
                int b = 0;
                if(mid+1>=n){
                    b = num2[(int)mid + 1-n];
                } else {
                    b = nums1[(int)mid+1];
                }
                System.out.println(df.format((double)(a+b)/2));
            }
        } else {
            if(mid>n){
                System.out.println(df.format((double)num2[(int)mid-n]));
            } else {
                System.out.println(df.format((double)nums1[(int)mid]));
            }
        }
    }
}

