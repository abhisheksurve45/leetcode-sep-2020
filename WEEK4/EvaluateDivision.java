public class EvaluateDivision {

    class Solution {

        private class Node {

            String key;
            double val;

            Node(String _key, double _val) {
                key = _key;
                val = _val;
            }
        }

        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

            Map<String, List<Node>> graph = buildGraph(equations, values);

            double[] result = new double[queries.size()];

            for (int i = 0; i < queries.size(); i++) {

                result[i] = dfs(queries.get(i).get(0), queries.get(i).get(1), new HashSet(), graph);

            }

            return result;
        }

        private double dfs(String source, String dest, Set<String> visited, Map<String, List<Node>> graph) {

            if (!(graph.containsKey(source) && graph.containsKey(dest))) return -1.0;

            if (source.equals(dest)) return 1.0;

            visited.add(source);

            for (Node ng : graph.get(source)) {

                if (!visited.contains(ng.key)) {

                    double ans = dfs(ng.key, dest, visited, graph);

                    if (ans != -1.0) {

                        return ans * ng.val;

                    }
                }

            }

            return -1;

        }


        private Map<String, List<Node>> buildGraph(List<List<String>> equations, double[] values) {

            Map<String, List<Node>> graph = new HashMap<>();

            for (int i = 0; i < values.length; i++) {

                String src = equations.get(i).get(0);
                String des = equations.get(i).get(1);

                graph.putIfAbsent(src, new ArrayList<>());
                graph.putIfAbsent(des, new ArrayList<>());

                graph.get(src).add(new Node(des, values[i]));
                graph.get(des).add(new Node(src, 1 / values[i]));
            }

            return graph;
        }

    }
}
