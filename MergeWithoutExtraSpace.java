/**
 * 
    Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order 
    without using any extra space. Modify arr1 so that it contains the first N elements and modify arr2 so that it 
    contains the last M elements.

    Input: 
    n = 4, arr1[] = [1 3 5 7] 
    m = 5, arr2[] = [0 2 6 8 9]

    Output: 
    arr1[] = [0 1 2 3]
    arr2[] = [5 6 7 8 9]
    
    Explanation:
    After merging the two 
    non-decreasing arrays, we get, 
    0 1 2 3 5 6 7 8 9.


 */

import java.util.Arrays;
import java.util.Scanner;

public class MergeWithoutExtraSpace {

    public static int createGap(int gap) {
        if(gap <= 1){
            return 0;
        }
        return (gap / 2) + (gap % 2);
    }

    public void merge(long arr1[], long arr2[], int n, int m) {
        int gap = n + m;
        int i = 0;
        int j = 0;

        for(gap = createGap(gap); gap > 0; gap = createGap(gap)){
            // comparing in first arr
            for(i = 0; i+gap < n; i++){
                if(arr1[i] > arr1[gap+i]){
                    long temp = arr1[i];
                    arr1[i] = arr1[gap + i];
                    arr1[gap+i] = temp;
                }
            }

            // comparing in both the arrays
            for(j = gap > n ? gap-n:0; j < m && i < n; i++, j++){
                if(arr1[i] > arr2[j]){
                    long temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }

            // comparing the 2nd array
            if(j < m){
                for(j = 0; j+gap < m; j++){
                    if(arr1[j] > arr2[j+gap]){
                        long temp = arr1[j];
                        arr2[j] = arr2[j+gap];
                        arr2[j+gap] = temp;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long arr1[] = new long[n];
        for(int i = 0; i < n; i++){
            arr1[i] = input.nextLong();
        }

        int m = input.nextInt();
        long arr2[] = new long[m];
        for(int i = 0; i < m; i++){
            arr2[i] = input.nextLong();
        }
        MergeWithoutExtraSpace obj = new MergeWithoutExtraSpace();

        obj.merge(arr1, arr2, n, m);
        System.out.println(Arrays.toString(arr1)+" "+Arrays.toString(arr2));


        input.close();
    }
}
