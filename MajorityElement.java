/**
    Input :
    N = 5
    A[] = {3, 1, 3, 3, 2}

    Output: 
    3


    Explation:

    (Using Moore’s Voting Algorithm):   

    Approach: This is a two-step process. 

    1. The first step gives the element that maybe the majority element in the array. If there is a majority element in an array, then this 
    step will definitely return majority element, otherwise, it will return candidate for majority element.

    2. Check if the element obtained from the above step is majority element. This step is necessary as there might be no majority element.


    Algorithm: 

    1. Loop through each element and maintains a count of majority element, and a majority index, maj_index
    2. If the next element is same then increment the count if the next element is not same then decrement the count.
    3. if the count reaches 0 then changes the maj_index to the current element and set the count again to 1.
    4. Now again traverse through the array and find the count of majority element found.
    5. If the count is greater than half the size of the array, print the element
    6. Else print that there is no majority element
 */

import java.util.Scanner;

public class MajorityElement {

    // method which prints the majority element
    public void printMajorityElement(int arr[], int n){
        int cand = findMajority(arr, n);

        if(isMalority(arr, n, cand)){
            System.out.print(cand);
        } else {
            System.out.print("No majority element");
        }

    }

    // ṃethod which finds the majority element
    public int findMajority(int arr[], int n) {
        int majority_index = 0;
        int count = 1;

        for(int i = 1; i < n; i++){
            if(arr[majority_index] == arr[i]){
                count++;
            } else{
                count--;
            }

            if(count == 0){
                majority_index = i;
                count = 1;
            }
        }
        return arr[majority_index];

    }

    // the method which checks if the given candidate is a majority element
    public boolean isMalority(int arr[], int n, int cand){
        int count = 0;
        for(int i = 0; i < n; i++){
            if (arr[i] == cand){
                count++;
            }
        }

        if(count > (n/2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MajorityElement mj = new MajorityElement();
        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();
        System.out.print("Enter the array elements: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        mj.printMajorityElement(arr, n);
        input.close();

    }
}
