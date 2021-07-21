/**
 * Input:
 * 5
 * 
 * Output:
 *         *
 *       *  *
 *     *  *  *
 *   *  *  *  *
 * *  *  *  *  *
 */

package patterns;

import java.util.*;

public class pattern_4 {

    public static void printPyramid(int n){
        for (int i = 0; i < n; i++){
            for(int j = n-i; j > 1; j-- ){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++){
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
