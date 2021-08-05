/**
 * There are n trees in a forest. The heights of the trees is 
 * stored in array tree[], where tree[i] denotes the height of 
 * the ith tree in the forest. If the ith tree is cut at a 
 * height H, then the wood collected is tree[i] - H, provided 
 * tree[i] > H. If the total woods that needs to be collected is 
 * exactly equal to k, find the height H at which every tree 
 * should be cut (all trees have to be cut at the same height). 
 * If it is not possible then return -1 else return H.
 * 
 * Input:
    n = 5, k = 4
    nums[] = {2, 3, 6, 2, 4}

    Output: 3

    Explanation: Wood collected by cutting trees
    at height 3 = 0 + 0 + (6-3) + 0 + (4-3) = 4
    hence 3 is to be subtracted from all numbers.
    Since 2 is lesser than 3, nothing gets
    subtracted from it.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class binSearchInforest {

    public static int minElement(ArrayList<Integer> arrlist) {
        int min = arrlist.get(0);
        for(int s: arrlist){
            if(min > s){
                min = s;
            }
        }
        return min;
    }

    public static int minHeightToCut(int arr[], int n, int k) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arrlist.add(arr[i]);
        }
        
        int sum = 0;
        int min = 0;
        
        while(true){
            min = minElement(arrlist);
            sum = 0;
            for(int i = 0; i < n; i++){
                int rex = arr[i]-min > 0 ? arr[i]-min : 0;
                sum = sum + rex;
            }
            arrlist.remove(arrlist.indexOf(min));
            if(sum == k){
                break;
            } else if(arrlist.isEmpty()){
                break;
            }
        }

        if(sum == k){
            return min;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(minHeightToCut(arr, n, k));
        input.close();
    }
}
