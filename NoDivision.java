/**
 * Given an array nums, print an array answer such that answer[i] is equal 
 * to product of all the element of the nums except nums[i]
 * 
 * You must write an algorithm without using the division operator
 * 
 * Input:
 * 4
 * 1 2 3 4
 * 
 * Output:
 * 24 12 8 6
 */

import java.util.Arrays;
import java.util.Scanner;

public class NoDivision{

    public void fillArrays(int arr[], int n, int left[], int right[]){
        for(int i = 0; i < n; i++){
            int product = 1;
            int j = i+1;
            while(j < n){
                product = product*arr[j];
                j++;
            }
            right[i] = product;
        }

        for(int i = n-1; i >= 0; i--){
            int product = 1;
            int j = i-1;
            while(j >= 0){
                product = product*arr[j];
                j--;
            }
            left[i] = product;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        input.close();

        int right[] = new int[n];
        int left[] = new int[n];
        NoDivision obj = new NoDivision();
        obj.fillArrays(arr, n, left, right);
        for(int i = 0; i < n; i++){
            arr[i] = left[i] + right[i];
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr).replace("[", "").replace("]", "").trim().replace(", ", " "));
        
    }
}