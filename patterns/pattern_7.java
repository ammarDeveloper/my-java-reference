/*
    Input : 5

    Output :
                *
             *  *
          *  *  *
       *  *  *  *
    *  *  *  *  *
       *  *  *  *
          *  *  *
             *  *
                *
*/

package patterns;

import java.util.*;

public class pattern_7 {

    public static void printLeftPascal(int n){
        for (int i = 0; i < n+1; i++){
            for (int j = 0; j < n; j++){
                if (j >= n-i){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n+1; i++){
            for(int j = 0; j < n; j++){
                if(j <= i){
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        

        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printLeftPascal(n);
        input.close();
    }
}
