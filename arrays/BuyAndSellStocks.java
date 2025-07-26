public class BuyAndSellStocks {
    static int maximumProfit(int[] prices){
        int maxProfit = 0;
        int min = prices[0];
        int n = prices.length;
        int cost = 0;
        for(int i = 1; i < n; i++){
            cost = prices[i] - min;
            maxProfit = Math.max(maxProfit, cost);
            min = Math.min(min, prices[i]);

        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit is " + maximumProfit(prices));
    }
}
