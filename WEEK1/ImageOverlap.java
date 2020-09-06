public class ImageOverlap {

    class Solution {


        public int largestOverlap(int[][] A, int[][] B) {

            int largestOverlap = 0;

            for (int row = -A.length + 1; row < A.length; row++) {

                for (int col = -A.length + 1; col < A.length; col++) {

                    largestOverlap = Math.max(largestOverlap, overlaped(A, B, row, col));

                }

            }

            return largestOverlap;
        }

        private int overlaped(int[][] A, int[][] B, int rowOff, int colOff) {

            int count = 0;

            for (int row = 0; row < B.length; row++) {

                for (int col = 0; col < B.length; col++) {

                    if ((row + rowOff < 0) || (row + rowOff >= A.length) || (col + colOff < 0) || (col + colOff >= A.length)) {
                        continue;
                    }

                    if (A[row][col] == 1 && B[row + rowOff][col + colOff] == 1) {
                        count++;
                    }
                }
            }


            return count;
        }
    }
}
