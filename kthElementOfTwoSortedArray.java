/**
 * Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the 
 * element that would be at the k’th position of the final sorted array.
 * 
 *  Input:
 * n = 5
    arr1[] = {2, 3, 6, 7, 9}
    m = 4
    arr2[] = {1, 4, 8, 10}
    k = 5


    Output:
    6


    Explanation:
    The final sorted array would be -
    1, 2, 3, 4, 6, 7, 8, 9, 10
    The 5th element of this array is 6.
 */

import java.util.Arrays;
import java.util.Scanner;

public class kthElementOfTwoSortedArray {

    public static int  createGap(int gap) {
        if(gap <= 1){
            return 0;
        }
        return (gap/2)+(gap%2);
    }

    public int Kthelement(int arr1[], int arr2[], int n, int m, int k) {
        int i = 0; int j = 0; int gap = n + m;
        for(gap = createGap(gap); gap > 0; gap = createGap(gap)){
            // comparing the first array
            for(i = 0; i+gap < n; i++){
                if(arr1[i] > arr1[i+gap]){
                    int temp = arr1[i];
                    arr1[i] = arr1[i+gap];
                    arr1[i+gap] = temp;
                }
            }


            // comparing the both the array
            for(j = gap > n?gap-n:0; j < m && i < n; i++, j++){
                if(arr1[i] > arr2[j]){
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }

            // comparing the second array if it is larger the first array
            if(j < m){
                for(j = 0; j+gap < m; j++){
                    if(arr2[j] > arr2[j+gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j+gap];
                        arr2[j+gap] = temp;
                    }
                }
            }
            
        }
        System.out.println(Arrays.toString(arr1)+ " "+ Arrays.toString(arr2));
        if(k <= n){
            return arr1[k-1];
        }
        return arr2[k-n-1];

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr1[] = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = input.nextInt();
        }

        int m = input.nextInt();
        int arr2[] = new int[m];
        for(int i = 0; i< m; i++){
            arr2[i] = input.nextInt();
        }

        int k = input.nextInt();

        kthElementOfTwoSortedArray obj = new kthElementOfTwoSortedArray();
        System.out.println(obj.Kthelement(arr1, arr2, n, m, k));

        input.close();
    }
}
