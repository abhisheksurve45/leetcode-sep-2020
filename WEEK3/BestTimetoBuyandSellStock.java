public class BestTimetoBuyandSellStock {

    class Solution {
        public int maxProfit(int[] prices) {

            if (prices.length == 0) return 0;

            int max = 0, localMin = Integer.MAX_VALUE;

            for (int i = 0; i < prices.length; i++) {

                if (prices[i] < localMin) {
                    localMin = prices[i];
                } else if (prices[i] - localMin > max) {

                    max = prices[i] - localMin;
                }

            }

            return max;
        }
    }
}
