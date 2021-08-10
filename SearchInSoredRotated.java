/**
 * An element in a sorted array can be found in O(log n) time via binary search. But suppose we rotate an ascending order sorted array at 
 * some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the 
 * rotated array in O(log n) time.
 * 
 * Input: 
 * n = 9
 * arr[] = {5 6 7 8 9 10 1 2 3}
 * k = 10
 * 
 * output:
 * 5
 */
import java.util.Scanner;

public class SearchInSoredRotated {

    public static int findMin(int arr[], int n) {
        int low = 0;
        int high = n-1;
        int mid = 0;

        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] < arr[(mid-1)%n] && arr[mid] < arr[(mid+1)%n]){
                break;
            } else if(arr[mid] < arr[low]){
                high = mid -1;
            } else if(arr[mid] > arr[high]){
                low = mid+1;
            } else {
                mid = 0;
                break;
            }
        }
        return mid;
    }

    public static int findElement(int arr[], int low, int high, int k) {
        int mid = 0;

        while(low <= high){
            mid = (high+low)/2;
            if(arr[mid] > k){
                high = mid-1;
            } else if(arr[mid] < k) {
                low = mid+1;
            } else {
                break;
            }
        }

        if(arr[mid] == k){
            return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        input.close();
        int min = findMin(arr, n);

        int first = findElement(arr, 0, min, k);
        int second = findElement(arr, min, n-1, k);
        
        if(first != -1){
            System.out.println(first);
        } else if(second != -1) {
            System.out.println(second);
        } else{
            System.out.println("no element fond");
        }
        
    }
}
