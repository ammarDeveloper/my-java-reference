/*
    Given a fraction. Convert it into a decimal. 
    If the fractional part is repeating, enclose the repeating part in parentheses.

    Input : 
    1
    3

    Output :
    0.(3)

    
    Input :
    1
    2

    Output :
    0.5
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleFraction {

    // method calculates the fraction and returns it in string
    public static String findSimpleFraction(long num, long den) {
        
        if (num == 0){       // if the numerator is '0' then the answer will be '0'
            return "0";
        }
        if(den == 0){        // if the denomenator is '0' then the answer wil be '0'
            return "";
        }

        long quo = num / den;
        long rem = (num % den)*10;

        StringBuilder str = new StringBuilder();
        str.append(String.valueOf(quo));

        if (rem == 0){          // after finding the remainder and the quotiant if the remainder is '0' the ans is quotiant
            return str.toString();
        }

        str.append(("."));

        Map<Long, Integer> m = new HashMap<>();         // creating the hash map

        while(rem != 0){            // iterating untill the remainder '0'
            if(m.containsKey(rem)){
                String part1 = str.substring(0, m.get(rem));
                String part2 = "("+str.substring(m.get(rem), str.length())+")";
                return part1 + part2;
            }

            m.put(rem , str.length());
            quo = rem / den;
            str.append(String.valueOf(quo));
            rem = (rem % den) * 10;
        }
        return str.toString();
        
    }

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextInt();
        long den = input.nextInt();
        System.out.println(findSimpleFraction(num, den));
        input.close();
    }
}
