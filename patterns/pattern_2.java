/**
 * Input:
 * 5
 * 
 * Output:
 *  *  *  *  *  * 
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 */

package patterns;

import java.util.*;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        input.close();
    }
}