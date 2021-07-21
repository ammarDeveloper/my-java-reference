/**
    Given an array of size N, find the smallest positive integer value that cannot be represented 
    as sum of some elements from the array.

    Input : 
    6
    1 10 3 11 16 15

    Output :
    2

    Input : 
    3
    1 1 1

    Output :
    4
 */


import java.util.Scanner;

public class SmallestNotSum {
    
    // method to find the smallest not posible sum
    public static int  find_the_least_sum(int arr[], int n) {
        int res = 1;
        for (int i = 0; (i < n) && (arr[i] <= res); i++){
            res = res + arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = input.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++){
            int a = i+1;
            System.out.println("Enter the "+ a + " Number: ");
            arr[i] = input.nextInt();
        }

        System.out.println(find_the_least_sum(arr, n));

        input.close();
    }
}
