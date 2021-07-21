/**
    Given an array A[] of N positive integers which can contain integers from 1 to P where elements can be repeated 
    or can be absent from the array. Your task is to count the frequency of all elements from 1 to N.

    Input:
    N = 4
    P = 3
    arr[] = {3,3,3,3}

    Output:
    0 0 4 0
    
    Explanation: 
    Counting frequencies of each array element
    We have:
    1 occurring 0 times.
    2 occurring 0 times.
    3 occurring 4 times.
    4 occurring 0 times.
 */

import java.util.Scanner;

public class FrequencyCount {

    public static void printFrqurency(int arr[], int n, int p) {
        for (int i = 0; i < n; i++){
            arr[i] = arr[i] -1;
        }

        for(int i = 0; i < n; i++){
            arr[arr[i] % p] = arr[arr[i] % p] + p;
        }

        for(int i = 0; i < n; i++){
            System.out.print((arr[i] / p)+ " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        printFrqurency(arr, n, p);
        input.close();
    }
}
