
public class BuyAndSellStock {
    public static void main(String[] args) {
        // System.out.println(buyAndSellStock(new int[] { 1 }));
    }

    public static int buyAndSellStock(int arr[]) {
        int min = Integer.MAX_VALUE;
        int currentProfit;
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            currentProfit = arr[i] - min;
            profit = Math.max(profit, currentProfit);
        }
        return profit;
    }
}
