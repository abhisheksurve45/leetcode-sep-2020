public class RepeatedSubstringPattern {

    class Solution {
        public boolean repeatedSubstringPattern(String s) {

            int len = s.length();

            for (int i = len / 2; i > 0; i--) {

                if (len % i == 0) {

                    int j = 0;

                    while (i + j < len && s.charAt(j) == s.charAt(i + j))
                        j++;

                    if (i + j == len) return true;

                }

            }

            return false;
        }
    }

}
