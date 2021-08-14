import java.util.*;

public class elementInSortedMatrix {

    public static boolean findEle(int arr[][], int row, int col, int num) {
        int low = 0;
        int high = row-1;
        int mid = 0;
        while(low <= high){
            mid = (high+low)/2;
            if(arr[mid][0] > num){
                high = mid-1;
            } else if(arr[mid][0] < num){
                low = mid +1;
            } else {
                return true;
            }
        }
        int con = mid;
        low = 0;
        high = col-1;


        while(low <= high){
            mid = (high+low)/2;
            if(arr[con][mid] > num){
                high = mid-1;
            } else if(arr[con][mid] < num){
                low = mid+1;
            } else {
                return true;
            }
        }


        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int arr[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = input.nextInt();
            }
        }
        int num = input.nextInt();
        input.close();

        System.out.println(findEle(arr, row, col, num));
    }
}
