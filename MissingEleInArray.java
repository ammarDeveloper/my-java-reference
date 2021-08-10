import java.util.HashSet;
import java.util.Scanner;

public class MissingEleInArray {

    public static void findMissing(int A[], int B[], int n, int m) {
        HashSet<Integer> set = new HashSet<>();
        for(int a:B){
            set.add(a);
        }

        for(int a:A){
            if(!set.contains(a)){
                System.out.print(a+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A[] = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = input.nextInt();
        }

        int m = input.nextInt();
        int B[] = new int[m];
        for(int i = 0; i < m; i++){
            B[i] = input.nextInt();
        }

        input.close();
        findMissing(A, B, n, m);
    }
}
 