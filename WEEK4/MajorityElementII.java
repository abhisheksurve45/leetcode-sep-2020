public class MajorityElementII {


    class Solution {

        /**
         * There can be atmost 2 possible majorityElements
         */
        public List<Integer> majorityElement(int[] nums) {

            List<Integer> majorityElements = new ArrayList<>();

            if (nums.length == 0) return majorityElements;

            int countx = 0, county = 0, x = -1, y = -1;

            // FIND THE POSSIBLE CANDIDATES
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == x) countx++;

                else if (nums[i] == y) county++;

                else if (countx == 0) {
                    x = nums[i];
                    countx = 1;
                } else if (county == 0) {
                    y = nums[i];
                    county = 1;
                } else {
                    countx--;
                    county--;
                }
            }

            countx = 0;
            county = 0;

            // FIND THE CANDIDATE OCC COUNT
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == x) countx++;
                if (nums[i] == y) county++;

            }

            if (countx > nums.length / 3) {
                majorityElements.add(x);
            }

            if (county > nums.length / 3) {
                majorityElements.add(y);
            }

            return majorityElements;
        }

    }
}
