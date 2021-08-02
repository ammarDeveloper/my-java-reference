import java.util.Arrays;

public class MaxIndexForGivenIndex {

    public static int maxIndex(int arr[], int n){
        int temp[] = new int[n+1];
        Arrays.fill(temp, Integer.MIN_VALUE);
        for(int i = n-1; i >= 0; i--){
            temp[i] = Math.max(temp[i+1], arr[i]);
        }
        int result = 0;
        for(int i = 0; i < n; i++){
            int low = i+1, high = n;
            int ans = i;
            while(low <= high){
                int mid = (high + low)/2;
                if(arr[i] <= temp[mid]){
                    ans = Math.max(ans, mid);
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
            result = Math.max(result, ans-i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 9;
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndex(arr, n));
    }
}
