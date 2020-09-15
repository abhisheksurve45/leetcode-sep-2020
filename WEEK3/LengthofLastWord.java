public class LengthofLastWord {

    class Solution {

        public int lengthOfLastWord(String s) {

            String[] arr = s.split("\\s+");

            return arr.length == 0 ? 0 : arr[arr.length - 1].length();
        }
    }

}
