public class GasStation {

    /**
     * Naive approach : try finding solution from every gas station
     */
    class Solution {

        public int canCompleteCircuit(int[] gas, int[] cost) {

            int n = gas.length;

            for (int i = 0; i < n; i++) {

                int stops = 0, gasSpent = 0, j = i;

                while (stops < n) {

                    gasSpent += gas[j % n] - cost[j % n];

                    if (gasSpent < 0) {
                        break;
                    }

                    j++;
                    stops++;
                }

                if (stops == n && gasSpent >= 0) {
                    return i;
                }

            }

            return -1;
        }
    }


    class Solution {

        public int canCompleteCircuit(int[] gas, int[] cost) {

            int totalGas = 0, totalCost = 0, start = 0, tank = 0;

            for (int i = 0; i < gas.length; i++) {

                totalGas += gas[i];

                totalCost += cost[i];

                tank += gas[i] - cost[i];

                if (tank < 0) {
                    start = i + 1;
                    tank = 0;
                }
            }

            return (totalCost > totalGas) ? -1 : start;
        }
    }

}
