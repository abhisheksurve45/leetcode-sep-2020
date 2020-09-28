public class SubarrayProductLessThanK {

    class Solution {

        public int numSubarrayProductLessThanK(int[] nums, int k) {

            if (k <= 1) return 0;

            int count = 0, left = 0, right = 0, product = 1;

            while (right < nums.length) {

                product *= nums[right];

                while (product >= k) {
                    product /= nums[left++];
                }

                count += right - left + 1;

                right++;
            }

            return count;
        }
    }
}
