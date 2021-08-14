import java.util.Scanner;

public class GCDandLCM {

    public int findGcd(int a, int b){
        if(b == 0){
            return a;
        }

        return findGcd(b, a%b);
    }

    public int findLcm(int a, int b, int gcd){
        return Math.abs(a*b) / gcd;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        GCDandLCM obj = new GCDandLCM();
        int gcd = obj.findGcd(a, b);
        System.out.println(gcd);

        System.out.println(obj.findLcm(a, b, gcd));
        input.close();
    }
}
