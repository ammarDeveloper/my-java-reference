/**
    Given an unsorted array arr[] of size N, rotate it by D elements in the counter-clockwise direction. 

    Input : 
    N = 2, D = 2
    arr = 1 2 3 4 5

    Output :
    3 4 5 1 2

    Explanation: 1 2 3 4 5  when rotated
    by 2 elements, it becomes 3 4 5 1 2.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array {
    
    // method to rotate the array
    public static void RotateArray(int arr[], int n, int s) {
        int i = 0;
        int j = n-1;

        for(int x = 0; x < s; x++){
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    // main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        RotateArray(arr, n, s);
        System.out.print(Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", "").replace(" ", "").replace("", " ").strip());
        input.close();
    }


}
