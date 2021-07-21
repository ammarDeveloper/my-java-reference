/**
 * find the permutations of the given string
 * 
 * Input:
 * ABC
 * 
 * Output:
 * ABC ACB BAC BCA CBA CAB 
 */
import java.util.*;

public class Permutation_of_stings {

    // method to swap the elements
    public static void swap(char str[], int j, int i) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        
    }

    // A recurcive method which find all the posible permutations
    public static void findPermutation(char str[], int startidx,  int endidx) {
        if (startidx == endidx-1){
            System.out.print(Arrays.toString(str).replace("[", "").replace("]", "").replace(",", "").replace(" ", "")+" ");
            return;
        }

        for(int i = startidx; i < endidx; i++){
            swap(str, startidx, i);
            findPermutation(str, startidx+1, endidx);
            swap(str, startidx, i);
        }
        
    }

    // main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
        }

        int n = str.length();

        findPermutation(ch, 0, n);

        input.close();
    }
    
}
