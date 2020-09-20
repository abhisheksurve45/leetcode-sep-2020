public class UniquePathsIII {

    class Solution {

        int uniquePaths = 0;

        public int uniquePathsIII(int[][] grid) {

            int totalZeros = 0, x = 0, y = 0;

            for (int i = 0; i < grid.length; i++) {

                for (int j = 0; j < grid[0].length; j++) {

                    if (grid[i][j] == 0) totalZeros++;

                    if (grid[i][j] == 1) {
                        x = i;
                        y = j;
                    }
                }
            }

            dfs(grid, x, y, totalZeros);

            return uniquePaths;
        }

        private void dfs(int[][] grid, int x, int y, int totalZeros) {

            // BASE COND
            if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == -1 || (grid[x][y] == 2 && totalZeros != 0) || grid[x][y] == -99) {
                return;
            }

            if (grid[x][y] == 2 && totalZeros == 0) uniquePaths++;

            if (grid[x][y] == 0) totalZeros--;

            int temp = grid[x][y];

            grid[x][y] = -99;

            dfs(grid, x + 1, y, totalZeros);
            dfs(grid, x - 1, y, totalZeros);
            dfs(grid, x, y + 1, totalZeros);
            dfs(grid, x, y - 1, totalZeros);


            grid[x][y] = temp;
        }
    }
}
