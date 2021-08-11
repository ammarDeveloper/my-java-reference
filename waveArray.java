/**
 * Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it
    In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5]...

    Input:
    n = 5
    arr[] = {1,2,3,4,5}

    Output: 2 1 4 3 5
    
    Explanation: Array elements after 
    sorting it in wave form are 
    2 1 4 3 5.

 */

import java.util.Scanner;

public class waveArray{

    public void wA(int A[], int n){
        int len = n/2;
        for (int i = 0,j = 0; i < len; i++, j=j+2) {
            System.out.println(j);
            int temp = A[j];
            A[j] = A[j+1];
            A[j+1] = temp;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        input.close();
        waveArray obj = new waveArray();
        obj.wA(A, n);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }

    }
}