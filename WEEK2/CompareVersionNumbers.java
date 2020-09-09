public class CompareVersionNumbers {

    class Solution {

        public int compareVersion(String version1, String version2) {

            String[] v1Arr = version1.split("\\.");
            String[] v2Arr = version2.split("\\.");


            for (int i = 0; i < Math.max(v1Arr.length, v2Arr.length); i++) {

                Integer v1 = i < v1Arr.length ? Integer.parseInt(v1Arr[i]) : 0;
                Integer v2 = i < v2Arr.length ? Integer.parseInt(v2Arr[i]) : 0;

                int compare = v1.compareTo(v2);

                if (compare != 0) return compare;
            }

            return 0;
        }
    }

}
