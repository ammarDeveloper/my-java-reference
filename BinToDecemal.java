import java.util.*;

/**
 * BinToDecemal
 */
public class BinToDecemal {

    public static int binToDecemal(int bin) {
        String binString = Integer.toString(bin);
        return Integer.parseInt(binString, 2);
    }

    public static int binToDecemalSec(int bin) {
        int pow = 0;
        int num = 0;
        while(bin > 0){
            int res = bin%10;
            if(res == 1){
                num = num + (int) Math.pow(2, pow);
            }
            pow++;
            bin = bin/10;
        }

        return num;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bin = input.nextInt();
        input.close();
        System.out.println(binToDecemal(bin));
        System.out.println(binToDecemalSec(bin));

    }
    
}