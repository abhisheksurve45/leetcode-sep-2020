public class PartitionLabels {

    class Solution {
        public List<Integer> partitionLabels(String S) {
            int len = S.length();

            int[] lastIndex = new int[26];
            List<Integer> partitionLabels = new ArrayList<>();

            for (int i = 0; i < len; i++) lastIndex[S.charAt(i) - 'a'] = i;

            int i = 0;

            while (i < len) {

                int end = lastIndex[S.charAt(i) - 'a'];

                int j = i;

                while (j != end) {
                    end = Math.max(end, lastIndex[S.charAt(j++) - 'a']);
                }

                partitionLabels.add(j - i + 1);
                i = j + 1;

            }

            return partitionLabels;
        }
    }
}
