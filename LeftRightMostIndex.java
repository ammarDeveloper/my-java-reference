/**
 * Given a sorted array with possibly duplicate elements. The 
 * task is to find indexes of first and last occurrences of an 
 * element X in the given array.

    Note: If the element is not present in the array return {-1,-1} as pair.

    Input:
    N = 9
    v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
    X = 5

    Output:
    2 5
    
    Explanation:
    Index of first occurrence of 5 is 2
    and index of last occurrence of 5 is 5.

 
 */

import java.util.Scanner;

public class LeftRightMostIndex {

    public int firstInd(int arr[], int low, int high, int k) {
        int mid = 0;
        int result = 0;

        while(low <= high){
            mid = (high+low)/2;
            if(arr[mid] > k){
                high = mid-1;
            } else if(arr[mid] < k){
                low = mid+1;
            } else {
                result = mid;
                high = mid-1;
            }
        }
        return result;
    }

    public int lastInd(int arr[], int low, int high, int k) {
        int mid = 0;
        int result = 0;

        while(low <= high){
            mid = (high+low)/2;
            if(arr[mid] > k){
                high = mid-1;
            } else if(arr[mid] < k){
                low = mid+1;
            } else {
                result = mid;
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
        int x = input.nextInt();
        input.close();
        LeftRightMostIndex obj = new LeftRightMostIndex();
        System.out.println(obj.firstInd(arr, 0, n-1, x)+" "+obj.lastInd(arr, 0, n-1, x));
    }
}
