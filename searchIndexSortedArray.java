/**
 * Given a sorted array Arr[](0-index based) consisting of N distinct integers and an integer k, the task is to find the index of k, if 
 * it’s present in the array Arr[]. Otherwise, find the index where k must be inserted to keep the array sorted.
 * 
 * Input:
    N = 4
    Arr = {1 , 3, 5, 6}
    k = 5

    Output: 2

    Explaination: Since 5 is found at index 2 
    as arr[2] = 5, the output is 2.
 */

import java.util.Scanner;

public class searchIndexSortedArray {

    public int searchindexposition(int arr[], int low, int high, int k) {
        int prevmid = 0;
        int mid = 0;
        boolean elementfound = false;
        while(!elementfound){
            mid = (high + low)/2;
            if(arr[mid] > k){
                if(mid == prevmid-1){
                    mid = prevmid;
                    break;
                }
                prevmid = mid;
                high = mid;
            } else if(arr[mid] < k){
                if(mid == prevmid){
                    mid = mid+1;
                    break;
                }
                prevmid = mid;
                low = mid;
            } else {
                break;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        input.close();
        searchIndexSortedArray obj = new searchIndexSortedArray();
        System.out.println(obj.searchindexposition(arr, 0, arr.length-1, k));
    }
}
