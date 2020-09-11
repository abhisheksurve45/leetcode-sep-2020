public class MaximumProductSubarray {

    class Solution {

        private int max(int a, int b, int c) {
            return Math.max(a, Math.max(b, c));
        }

        private int min(int a, int b, int c) {
            return Math.min(a, Math.min(b, c));
        }

        public int maxProduct(int[] nums) {


            int result = nums[0];
            int currMax = nums[0];
            int currMin = nums[0];

            for (int i = 1; i < nums.length; i++) {

                int maxPrev = currMax;

                currMax = max(nums[i] * currMin, nums[i] * currMax, nums[i]);

                currMin = min(nums[i] * maxPrev, nums[i] * currMin, nums[i]);

                result = Math.max(result, currMax);

            }

            return result;
        }
    }
}
