/**
 * Given an array arr of n elements which is first increasing 
 * and then may be decreasing, find the maximum element in the 
 * array.
 * 
    Note: If the array is increasing then just print then last element will be the maximum value.

    Input: 
    n = 9
    arr[] = {1,15,25,45,42,21,17,12,11}

    Output: 45
    
    Explanation: Maximum element is 45.
 */

import java.util.Scanner;

public class BitonicPoint {

    public int findLargest(int arr[], int low, int high) {
        int result = 0;
        int mid = 0;

        while(low <= high){
            mid = (high+low)/2;
            if(mid == high){
                result = arr[mid];
                break;
            } else if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                result = arr[mid];
                break;
            } else if(arr[mid] > arr[mid+1]){
                high = mid-1;
            } else if(arr[mid] > arr[mid-1]){
                low = mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        BitonicPoint obj = new BitonicPoint();
        System.out.println(obj.findLargest(arr, 0, n-1));
    }
}
