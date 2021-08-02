/**
 * Given an array of positive integers. Find the length of the longest 
 * sub-sequence such that elements in the subsequence are consecutive 
 * integers, the consecutive numbers can be in any order.
 * 
 * Input:
    N = 7
    a[] = {2,6,1,9,4,5,3}

    Output:
    6

    Explanation:
    The consecutive numbers here
    are 1, 2, 3, 4, 5, 6. These 6 
    numbers form the longest consecutive
    subsquence.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Longest_Conecutive_Sequence {

    public static void divide(int arr[], int startIdx, int endIdx){
        if(startIdx < endIdx){
            int mid = startIdx + (endIdx - startIdx)/2;
            divide(arr, startIdx, mid);
            divide(arr, mid+1, endIdx);
            counqure(arr, startIdx, mid, endIdx);
        }
    }

    public static void counqure(int arr[], int startIdx, int mid, int endIdx){
        int n1 = mid + 1 - startIdx;
        int n2 = endIdx - mid;
        int temp1[] = new int[n1];
        int temp2[] = new int[n2];

        for(int i = 0; i < n1; i++){
            temp1[i] = arr[startIdx+i];
        }

        for(int i = 0; i < n2; i++){
            temp2[i] = arr[mid+1+i];
        }

        int i = 0;
        int j = 0;
        int k = startIdx;
        while(i < n1 && j < n2){
            if(temp1[i] < temp2[j]){
                arr[k] = temp1[i];
                i++;
                k++;
            } else {
                arr[k] = temp2[j];
                j++;
                k++;
            }
        }

        while(i < n1){
            arr[k] = temp1[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = temp2[j];
            j++;
            k++;
        }

    }

    public static void findLongestSequence(int arr[], int n){
        divide(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
        int ans = 0; 
        ArrayList<Integer> arints = new ArrayList<>();
        int i = 0;
        for(i = 0; i < n-1; i++){
            if(arr[i] != arr[i+1]){
                arints.add(arr[i]);
            }
        }
        arints.add(arr[i]);

        int count = 0;
        
        for(i = 0; i < arints.size()-1; i++){
            while((i < arints.size()-1) && (arints.get(i)+1 == arints.get(i+1))){
                count++;
                i++;
            }
            ans = Math.max(ans, count);
            count = 0;
        }
        System.out.println(ans+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        findLongestSequence(a, n);
        input.close();
    }
}
