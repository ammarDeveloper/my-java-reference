/**
 * Given an array Arr[] of N distinct integers and a range from 
 * L to R, the task is to count the number of triplets having a 
 * sum in the range [L, R].
 * 
 * Input:
    N = 4
    Arr = {8 , 3, 5, 2}
    L = 7, R = 11


    Output: 1

    
    Explaination: There is only one triplet {2, 3, 5}
    having sum 10 in range [7, 11].
 */

import java.util.Arrays;
import java.util.Scanner;

public class TriplatsOfGivenRange {

    public static int numOfTriplates(int arr[], int n, int l, int r) {
        int i = n-1;
        int left = 0;
        int right = i-1;
        int count = 0;

        while(i >= 2){
            while(left < right){
                boolean a = arr[left]+arr[right]+arr[i] >= l && arr[left] +arr[right]+arr[i] <= r ? true : false;
                if(a){
                    System.out.println(arr[left]+" "+arr[right]+" "+arr[i]);
                    count++;
                }
                right--;
            }
            i--;
            right = i-1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        int l = input.nextInt();
        int r = input.nextInt();
        input.close();
        Arrays.sort(arr);
        System.out.println(numOfTriplates(arr, n, l, r));
    }
    
}