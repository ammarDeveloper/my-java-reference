import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * NprimeNumbers
 */
public class NprimeNumbers {

    public static void make_seive(int arr[], int n) {
        arr[2] = 1;
        for(int i = 3; i < n; i++){
            if(arr[i] == 1){
                for(int j = i*i; j <= n; j = j+2*i){
                    arr[j] = 0;
                }
            }
        }
    }

    public static boolean has_zero(int n){
        while(n > 0){
            int r = n%10;
            if(r == 0){
                return true;
            }
            n = n/10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n+1];
        Arrays.fill(arr, 0);
        input.close();

        for (int i = 3; i < arr.length; i+=2) {
            arr[i] = 1;
        }
        make_seive(arr, n);
        
        int count = 0;
        ArrayList<Integer> resArr = new ArrayList<>();
        for(int i = 1; i < n; i++){
            if(!has_zero(i) && arr[i] == 1){
                System.out.println(has_zero(arr[i])+" "+arr[i]);
                count = count + 1;
                resArr.add(i);
            }
        }
        System.out.print(count);
        System.out.print(" (");
        for(int i = 0; i < resArr.size(); i++){
            System.out.print(resArr.get(i)+" ");
        }
        System.out.print(")");
    }
}