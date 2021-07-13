import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    // how to take arrays of int as an input
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int[] arr = new int[5];
        for (int i = 0; i<5; i++){
            arr[i] = input.nextInt();
        }

        String arrString = Arrays.toString(arr);
        System.out.println(arrString);
    }


    // how to take arrays of Strings as input
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int[] arr = new int[5];
        for (int i = 0; i<5; i++){
            arr[i] = input.nextInt();
        }

        String arrString = Arrays.toString(arr);
        System.out.println(arrString);
    }

    // how to take arrays of chars as an input
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        char[] arr = new char[5];
        for (int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }

        String arrString = Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", "");
        System.out.println(arrString);
        
    }
}
