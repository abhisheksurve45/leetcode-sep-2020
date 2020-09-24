public class FindtheDifference {

    class Solution {

        public char findTheDifference(String s, String t) {
            char x = 0;

            for (char ch : s.toCharArray()) {
                x ^= ch;
            }

            for (char ch : t.toCharArray()) {
                x ^= ch;
            }

            return x;
        }
    }
}
