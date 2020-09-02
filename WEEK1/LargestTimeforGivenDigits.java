public class LargestTimeforGivenDigits {

    class Solution {
        public String largestTimeFromDigits(int[] A) {

            List<String> validPermutations = new ArrayList<>();

            List<List<Integer>> permutations = new ArrayList<>();

            permutation(A, new ArrayList<>(), permutations, new boolean[4]);

            for (int i = 0; i < permutations.size(); i++) {

                String time = "";
                for (int j = 0; j < 4; j++) time += permutations.get(i).get(j);

                if (isValidTime(time)) validPermutations.add(time);
            }

            Collections.sort(validPermutations);

            String maxTime = "";

            if (validPermutations.size() > 0) {

                String time = validPermutations.get(validPermutations.size() - 1);

                maxTime = time.substring(0, 2) + ":" + time.substring(2);

            }

            return maxTime;
        }

        private boolean isValidTime(String time) {

            if (time.charAt(0) > '2') return false;

            if (time.charAt(0) == '2' && time.charAt(1) >= '4') return false;

            if (time.charAt(2) >= '6') return false;

            return true;
        }

        private void permutation(int[] input, List<Integer> curr, List<List<Integer>> perms, boolean[] visited) {

            if (curr.size() == input.length) {
                perms.add(new ArrayList<>(curr));
            } else {
                for (int i = 0; i < input.length; i++) {

                    if (visited[i]) continue;

                    visited[i] = true;
                    curr.add(input[i]);
                    permutation(input, curr, perms, visited);
                    curr.remove(curr.size() - 1);

                    visited[i] = false;

                }
            }
        }
    }
}
