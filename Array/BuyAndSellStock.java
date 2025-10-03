public class BuyAndSellStock {

    /**
     * Calculates the maximum profit that can be obtained by buying and selling a stock once.
     * The algorithm iterates through the prices, keeping track of the minimum price seen so far
     * and the maximum profit that can be obtained by selling at the current price.
     * Time Complexity: O(n) - single pass through the array
     * Space Complexity: O(1) - constant extra space
     * @param arr An array of stock prices.
     * @return The maximum profit that can be obtained.
     */
    public static int buyAndSellStock(int arr[]) {
        int num=0;
        int min = Integer.MAX_VALUE; // Initialize min to maximum possible value to find the lowest price
        int currentProfit;
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i]; // Update minimum price if current price is lower
            currentProfit = arr[i] - min; // Calculate profit if sold at current price
            profit = Math.max(profit, currentProfit); // Update maximum profit
        }
        //Test
        
        return profit;
    }
}