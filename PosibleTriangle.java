/**
 * Given an unsorted array arr[] of n positive integers. Find 
 * the number of triangles that can be formed with three 
 * different array elements as lengths of three sides of 
 * triangles. 
 * 
 * 
 * 
 * Input: 
    n = 3
    arr[] = {3, 5, 4}

    Output: 
    1
    
    Explanation: 
    A triangle is possible 
    with all the elements 5, 3 and 4.
 */

import java.util.Arrays;
import java.util.Scanner;

public class PosibleTriangle{

    public static int possibleTri(int arr[], int n){
        int i = n-1;
        int left = 0;
        int right = i-1;
        int count = 0;

        while(i >= 2){
            while(left < right){
                if((arr[right] + arr[left]) > arr[i]){
                    count = count + (right - left);
                    right--;
                } else if((arr[right] + arr[left]) <= arr[i]){
                    left++;
                }
            }
            i--;
            left=0;
            right=i-1;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        input.close();
        System.out.println(Arrays.toString(arr));
        System.out.println(possibleTri(arr, n));
    }
}