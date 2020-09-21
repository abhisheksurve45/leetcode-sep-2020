public class CarPooling {

    class Solution {

        public boolean carPooling(int[][] trips, int capacity) {

            int[] count = new int[1001];

            for (int[] trip : trips) {

                for (int i = trip[1]; i < trip[2]; i++) {
                    count[i] += trip[0];
                }

            }

            return Arrays.stream(count).max().getAsInt() <= capacity;
        }
    }

    class Solution {

        public boolean carPooling(int[][] trips, int capacity) {

            int[] count = new int[1001];

            for (int[] trip : trips) {
                count[trip[1]] += trip[0];
                count[trip[2]] -= trip[0];
            }

            for (int i = 0; i < 1001; i++) {

                capacity -= count[i];

                if (capacity < 0) {
                    return false;
                }

            }

            return true;
        }
    }
}
