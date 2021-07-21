/*
    Input : 5

    Output : 
                   * 
                 *  *
               *  *  *
             *  *  *  *
           *  *  *  *  *
         *  *  *  *  *  *
       *  *  *  *  *  *  *
     *  *  *  *  *  *  *  *
   *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *
   *  *  *  *  *  *  *  *  *
     *  *  *  *  *  *  *  *
       *  *  *  *  *  *  * 
         *  *  *  *  *  *
           *  *  *  *  *
             *  *  *  *
               *  *  *
                 *  *
                   *
*/

package patterns;

import java.util.*;

public class pattern_5 {

    public static void printPyramid(int n) {
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n-1-i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


        for(int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < n-i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
   
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printPyramid(n);
        input.close();
    }
}
