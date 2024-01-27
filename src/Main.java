//
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// using sliding window
public class Main {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};

        int maxProfit = calculateProfit(prices);

        System.out.println("Max Profit -> " +  maxProfit);
    }

    static int calculateProfit(int [] prices) {

        int maxProfit = 0;
        int buy = 0;
        int sell = 1;

        while (sell < prices.length) {
            int profit = prices[sell] - prices[buy];
            if (profit > 0) {
                maxProfit = Math.max(maxProfit, profit);
                sell++;
            }
            else {
                buy = sell;
                sell++;
            }
        }
        return maxProfit;
    }
}