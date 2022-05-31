package test.koplit.graph;

import java.util.ArrayList;
import java.util.Stack;

public class Connected {

    public static void main(String[] args) {
        int result = connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {3, 4},
                {3, 5},
        });
        System.out.println(result); // 2

    }

    public static int connectedVertices(int[][] edges) {
        // TODO:
        ArrayList<Integer> array = new ArrayList<>();
        int searchIndex = -1;

        for(int i = 0 ; i < edges.length; i++) {

            int vertax1 = edges[i][0];
            int vertax2 = edges[i][1];

            if(i != searchIndex) {
                array.add(1);
            }

            for(int j = i+1 ; j < edges.length; j++) {
                if(vertax1 == edges[j][0]
                        || vertax1 == edges[j][1]
                        || vertax2 == edges[j][0]
                        || vertax2 == edges[j][1]) {

                    searchIndex = j;
                    break;
                }
            }
        }

        return array.size();

    }
}
