public class CombinationSumIII {

    class Solution {

        private void combinationSum(int start, int k, int n, List<Integer> curr, List<List<Integer>> combinationSum) {

            if (n == 0 && curr.size() == k) {
                combinationSum.add(new ArrayList<>(curr));
            } else {

                for (int i = start; i <= 9; i++) {

                    curr.add(i);
                    combinationSum(i + 1, k, n - i, curr, combinationSum);
                    curr.remove(curr.size() - 1);

                }

            }

        }

        public List<List<Integer>> combinationSum3(int k, int n) {

            List<List<Integer>> combinationSum = new ArrayList<>();

            combinationSum(1, k, n, new ArrayList<>(), combinationSum);

            return combinationSum;
        }
    }
}
