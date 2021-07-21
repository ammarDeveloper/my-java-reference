/**
    Given a non-negative number represented as a list of digits, add 1 to the number (increment the number 
    represented by the digits). The digits are stored such that the most significant digit is first element of 
    array.

    Input: 
    N = 3
    arr[] = {1, 2, 4}

    Output: 
    1 2 5
    
    Explanation:
    124+1 = 125, and so the Output
 */

import java.util.Scanner;

public class PlusOne {

    public static int addOne(int arr[], int n){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++){
            str.append(String.valueOf(arr[i]));
        }
        return Integer.valueOf(str.toString())+1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(addOne(arr, n));
        input.close();
    }
}
