/**
 * Given an array arr[] of N positive integers. Find maximum value of |arr[i] 
 * – arr[j]| + |i – j|, (0 <= i, j <= N – 1)
 * 
 * Input:
    N = 4 
    arr[] = {1, 2, 3, 1}

    Output:
    4

    Explanation:
    Choosing i=0 and j=2, will result in
    |1-3|+|0-2| = 4, which is the maximum
    possible value.

    arr[i] – arr[j] + i – j = (arr[i] + i) – (arr[j] + j)
    arr[i] – arr[j] – i + j = (arr[i] – i) – (arr[j] – j)
    -arr[i] + arr[j] + i – j = -(arr[i] – i) + (arr[j] – j)
    -arr[i] + arr[j] – i + j = -(arr[i] + i) + (arr[j] + j)

    Now the task is to find the maximum value of these equations. So the 
    approach is to form two arrays, first_array[], it will store arr[i] + i, 0 
    <= i < n, second_array[], it will store arr[i] – i, 0 <= i < n. 

    Now our task is easy, we just need to find the maximum difference between 
    the two values of these two arrays.

    For that, we find the maximum value and minimum value in the first_array 
    and store their difference: 
 */

import java.util.Scanner;

public class MaxValueOfExpression {
    public static int maxValue(int arr[], int n) {
        int a[] = new int[n];
        int b[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = arr[i]+i;
            b[i] = arr[i]-i;
        }

        int x = a[0];
        int y = a[0];

        for (int i = 0; i < n; i++){
            if(a[i] > x){
                x = a[i];
            } else if(a[i] < y) {
                y = a[i];
            }
        }
        
        int ans1 = x - y;

        x = b[0];
        y = b[0];

        for (int i = 0; i < n; i++){
            if(b[i] > x){
                x = b[i];
            } else if(b[i] < y){
                y = b[i];
            }
        }

        int ans2 = x - y;

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.print(maxValue(arr, n));
        input.close();
    }
}
