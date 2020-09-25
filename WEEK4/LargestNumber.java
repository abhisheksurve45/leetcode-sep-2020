public class LargestNumber {

    class Solution {

        public String largestNumber(int[] nums) {
            int n = nums.length;

            String[] s = new String[n];

            for (int i = 0; i < n; i++) {
                s[i] = String.valueOf(nums[i]);
            }

            Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));

            StringBuilder sb = new StringBuilder();

            for (String str : s) sb.append(str);

            String largestNumber = sb.toString();

            return largestNumber.startsWith("0") ? "0" : largestNumber;
        }
    }
}
