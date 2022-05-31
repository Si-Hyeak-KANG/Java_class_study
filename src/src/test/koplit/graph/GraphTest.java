package test.koplit.graph;

public class GraphTest {

    public static void main(String[] args) {
        int[][] output2 = createMatrix(new int[][]{
                {0, 2, 0},
                {2, 4, 1},
                {1, 3, 1},
                {2, 1, 0},
        });

        System.out.println(output2);
    }

    public static int[][] createMatrix(int[][] edges) {
        // TODO:
        int max = edges[0][0];

        for (int i = 0 ; i < edges.length; i++) {

            for(int j = 0; j < edges[i].length; j++) {
                if(max < edges[i][j]) {
                    max = edges[i][j];
                }
            }
        }

        // graph
        int[][] graph = new int[max+1][max+1];

        for(int i=0; i < edges.length; i++) {

                int from = edges[i][0];
                int to = edges[i][1];
                int dir = edges[i][2];

                graph[from][to] = 1;

                if(dir == 1) {
                    graph[to][from] = 1;
                }
        }

        return graph;
    }
}
