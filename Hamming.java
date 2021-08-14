/**
 * Hamming number
 * 
 * Input:
 * 3
 * 14
 * 
 * Output:
 * 3
 */

import java.util.Scanner;


public class Hamming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        String firstBin = Integer.toBinaryString(firstNum);
        String secondBin = Integer.toBinaryString(secondNum);
        input.close();

        int i = firstBin.length()-1;
        int j = secondBin.length()-1;
        int count = 0;
        while(i >= 0 && j >= 0){
            if(firstBin.charAt(i) != secondBin.charAt(j)){
                count++;
            }
            i--;
            j--;
        }

        while(i >= 0){
            count++;
            i--;
        }

        while(j >= 0){
            count++;
            j--;
        }


        System.out.println(count);
    }
}
