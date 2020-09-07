public class WordPattern {

    class Solution {

        public boolean wordPattern(String pattern, String str) {

            String[] strings = str.split(" ");

            if (strings.length != pattern.length()) return false;

            Map<Character, String> map = new HashMap<>();

            for (int i = 0; i < strings.length; i++) {

                char c = pattern.charAt(i);

                if (map.containsKey(c)) {

                    if (!map.get(c).equals(strings[i])) return false;

                } else {
                    if (map.containsValue(strings[i])) return false;
                    else map.put(c, strings[i]);
                }
            }

            return true;
        }
    }
}
