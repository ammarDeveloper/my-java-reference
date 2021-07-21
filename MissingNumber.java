/*
    Given an array of size N-1 such that it 
    only contains distinct integers in the range of 1 to N. Find the missing element.

    Input :
    5
    1 2 3 5

    Output :
    4

    Input :
    10
    1 2 3 4 5 6 7 8 10

    Output :
    9
 */

import java.util.*;

class Solution {
    public static int findMissNumber(int A[]){
        int inc = 1;
        int i = 0;
        while(inc == A[i]){
            inc++;
            i++;
        }
        return inc;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A[] = new int[n-1];
        for (int i = 0; i < n-1; i++){
            A[i] = input.nextInt();
        }
        System.out.println(findMissNumber(A));
        input.close();
        
    }
}