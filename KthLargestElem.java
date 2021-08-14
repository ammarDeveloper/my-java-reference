/**
 * find the kth largest element in an array given
 * 
 * input:
 * 3 2 3 1 2 4 5 5 6
 * 4
 * 
 * Output:
 * 4
 */

import java.util.Scanner;
import java.util.*;

public class KthLargestElem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s[] = input.nextLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>(s.length);
        for(int i = 0; i < s.length; i++){
            arr.add(Integer.parseInt(s[i]));
        }
        int k = input.nextInt();
        input.close();

        Collections.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < k-1; i++){
            arr.remove(0);
        }
        System.out.println(arr.get(0));
    }
}
