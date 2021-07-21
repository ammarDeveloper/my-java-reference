/**
 * Input:
 * 5
 * 
 * Output:
 *              * 
 *           *  *
 *        *  *  *
 *     *  *  *  *
 *  *  *  *  *  *
 */

package patterns;

import java.util.*;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j >= n-1-i){
                    System.out.print(" * ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
