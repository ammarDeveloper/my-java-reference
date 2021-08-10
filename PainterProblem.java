/**
 * Dilpreet wants to paint his dog's home that has n boards with different lengths. The length of ith board is given by arr[i] where arr
 * [] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board. 
 * 

    The problem is to find the minimum time to get this job done if all painters start together with the constraint that any painter will 
    only paint continuous boards, say boards numbered {2,3,4} or only board {1} or nothing but not boards {2,4,5}.

    Input:
    n = 5
    k = 3
    arr[] = {5,10,30,20,15}

    Output: 35
    
    Explanation: The most optimal way will be:
    Painter 1 allocation : {5,10}
    Painter 2 allocation : {30}
    Painter 3 allocation : {20,15}
    Job will be done when all painters finish
    i.e. at time = max(5+10, 30, 20+15) = 35
 */

import java.util.Scanner;

public class PainterProblem {

    public static int[] lowhigh(int arr[], int n) {
        int lowandhigh[] = new int[2];
        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            sum = sum + arr[i];
        }
        lowandhigh[0] = max;
        lowandhigh[1] = sum;
        return lowandhigh;
    }

    public static boolean possible(int arr[], int k, int mid, int n) {

        int sol = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > mid){
                return false;
            } else if(sol+arr[i] > mid){
                sol = arr[i];
                k = k-1;
                if(k <= 0){
                    return false;
                }
            } else {
                sol = sol + arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        input.close();

        int low = lowhigh(arr, n)[0];
        int high = lowhigh(arr, n)[1];
        int ans = high;

        while (low <= high) {
            int mid = (low + high)/2;
            if(possible(arr, k, mid, n)){
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        System.out.println(ans);
        
    }
}

