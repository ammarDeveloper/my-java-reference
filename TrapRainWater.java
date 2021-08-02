/**
 * Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, 
 * compute how much water can be trapped between the blocks during the rainy season. 
 * 
    Input:
    N = 4
    arr[] = {7,4,0,9}

    Output:
    10
    
    Explanation:
    Water trapped by above 
    block of height 4 is 3 units and above 
    block of height 0 is 7 units. So, the 
    total unit of water trapped is 10 units.
 */

import java.util.*;

public class TrapRainWater {
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    public int trappingWater(int arr[], int n) { 
        int l[] = new int[n];
        int r[] = new int[n];
        
        int max = 0;
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
                l[i] = max;
            } else {
                l[i] = max;
            }
        }
        
        max = 0;
        
        for(int i = n-1; i >= 0; i--){
            if(max < arr[i]){
                max = arr[i];
                r[i] = max;
            } else {
                r[i] = max;
            }
        }

        int amountWater = 0;
        
        for(int i = 0; i < n; i++){
            
            amountWater = amountWater + (Math.min(l[i], r[i]) - arr[i]);
        }
        
        return amountWater;
        
    }
    
    public static void main(String[] args){
        TrapRainWater obj = new TrapRainWater();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(obj.trappingWater(arr, n));
        sc.close();
    }
}
