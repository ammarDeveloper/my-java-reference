/**
 * The cost of stock on each day is given in an array A[] of size N. Find all the days on which you buy and sell the stock so that in 
 * between those days your profit is maximum.
 * 
    Note: There may be multiple possible solutions. Return any one of them. Any correct solution will result in an output of 1, whereas 
    wrong solutions will result in an output of 0.

    Example 1:

    Input:
    N = 7
    A[] = {100,180,260,310,40,535,695}

    Output:
    1

    Explanation:
    One possible solution is (0 3) (4 6)
    We can buy stock on day 0,
    and sell it on 3rd day, which will 
    give us maximum profit. Now, we buy 
    stock on day 4 and sell it on day 6.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Stock_Buy_Sell {
    public static class Interval{
        int buy;
        int sell;

        Interval(int buy, int sell){
            this.buy = buy;
            this.sell = sell;
        }
    }

    public static void maxStocks(int arr[], int n){
        if(n == 1){
            return;
        }

        int i = 0;
        int count = 0;

        ArrayList<Interval> intervals = new ArrayList<>();

        while(i < n-1){
            while((i < n-1) && (arr[i] >= arr[i+1])){
                i++;
            }

            if(i == n-1){
                break;
            }

            Interval in = new Interval(i++, 0);

            while((i < n) && (arr[i] >= arr[i-1])){
                i++;
            }

            in.sell = i - 1;
            count++;
            intervals.add(in);
        }

        if(count == 0){
            System.out.println("No profitable stocks");
            return;
        } 
        for(int j = 0; j < intervals.size(); j++){
            System.out.println(intervals.get(j).buy+"   "+intervals.get(j).sell);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        maxStocks(arr, n);
        input.close();
    }
}
