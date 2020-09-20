public class SequentialDigits {

    class Solution {

        private static final String NUMBERS = "123456789";

        public List<Integer> sequentialDigits(int low, int high) {

            List<Integer> sequentialDigits = new ArrayList<>();

            for (int i = 2; i <= 9; i++) {

                for (int j = 0; j + i <= 9; j++) {

                    int num = Integer.parseInt(NUMBERS.substring(j, j + i));

                    if (num > high) return sequentialDigits;

                    if (num >= low) sequentialDigits.add(num);
                }

            }

            return sequentialDigits;
        }
    }
}
