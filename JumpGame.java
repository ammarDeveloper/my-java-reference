/**
 * Given an positive integer N and a list of N integers A[]. Each element in the array denotes the maximum length of jump you can cover. 
 * Find out if you can make it to the last index if you start at the first index of the list.
 * 
 * Input:
    N = 6
    A[] = {1, 2, 0, 3, 0, 0} 

    Output:
    1

    Explanation:
    Jump 1 step from first index to
    second index. Then jump 2 steps to reach 
    4th index, and now jump 2 steps to reach
    the end.

    Pseudo Code:
    1. iterate through the elements of the array till i = 0 reachs n -1
    2. create a nested loop inside the previous loop
    3. in inner loop iterate while the value of A[i] is not 0 while itrating increament i by 0ne and decrement A[i] by one and keep 
        checking if you reached the last index, if you did then return true.
    4. and after comming out of the second loop check if i is still equal to the index selected if yes then we can't reach the end return 
        false
    5.
 */
import java.util.Scanner;

public class JumpGame {

    public static boolean isLastIndexReached(int arr[], int n) {
        boolean flag = false;
        int i = 0;
        while(i < n){
            flag = false;
            int j = i;
            int a = arr[i];
            while(a != 0){
                i++;
                a--;
                if(i == n-1){
                    return true;
                }
                flag = true;
            }
            if(j == i){
                return false;
            }
        }
        return flag;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = input.nextInt();
        int A[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            A[i] = input.nextInt();
        }
        if(isLastIndexReached(A, n)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        input.close();
    }
}
