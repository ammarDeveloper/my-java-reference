/**
 * You are given N number of books. Every ith book has Ai number of pages. 
 * 
    You have to allocate books to M number of students. There can be many ways or permutations to do so. In each permutation, one of the M 
    students will be allocated the maximum number of pages. Out of all these permutations, the task is to find that particular permutation in 
    which the maximum number of pages allocated to a student is minimum of those in all the other permutations and print this minimum value. 



    Each book will be allocated to exactly one student. Each student has to be allocated at least one book.

    Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better 
    understanding).


    Input:
    N = 4
    A[] = {12,34,67,90}
    M = 2

    Output:
    113
    
    Explanation: 
    Allocation can be done in following ways:
    {12} and {34, 67, 90} Maximum Pages = 191
    {12, 34} and {67, 90} Maximum Pages = 157
    {12, 34, 67} and {90}  Maximum Pages =113
    Therefore, the minimum of these cases is 
    113, which is selected as the output.

 */
import java.util.Scanner;

public class AlMinNumOfPages {

    public static int[] lowHigh(int A[], int n) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(max < A[i]){
                max = A[i];
            }
            sum = sum +  A[i];
        }
        int retArr[] = {max, sum};
        return retArr;
    }

    public static boolean possible(int A[], int mid, int n, int m) {
        int sol = 0;
        for(int i = 0; i < n; i++){
            if(A[i] > mid){
                return false;
            } else if(sol+A[i] > mid){
                sol = A[i];
                m--;
                if(m <= 0){
                    return false;
                }
            } else {
                sol = sol + A[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        int n = input.nextInt();
        int A[] = new int[n];
        for(int i = 0 ; i < n; i++){
            A[i] = input.nextInt();
        }
        int m = input.nextInt();
        input.close();

        int low = lowHigh(A, n)[0];
        int high = lowHigh(A, n)[1];

        int mid = 0;
        int result = -1;
        while(low <= high){
            mid = (high + low)/2;
            if(possible(A, mid, n, m)){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(result);
    }
}