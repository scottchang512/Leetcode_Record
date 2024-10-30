class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        
        int minPrice = Integer.MAX_VALUE; // Track the lowest price
        int maxProfit = 0; // Track the maximum profit
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; // Update the maximum profit
            }
        }
        
        return maxProfit;
    }
}