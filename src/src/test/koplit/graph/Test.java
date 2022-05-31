package test.koplit.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        String output = barcode(3);
        System.out.println(output); // "121"

        output = barcode(7);
        System.out.println(output); // "1213121"

        output = barcode(8);
        System.out.println(output); // "12131231"

        output = barcode(20);
        System.out.println(output); // "12131231321231213123"
        
    }

    public static String barcode(int len) {
        // TODO:
        String result = "";
        List<Integer> array = new ArrayList<>();

        int[][] graph = new int[][]{
                {0,1,1}, // index : 0 (1)
                {1,0,1}, // index : 1 (2)
                {1,1,0} // index : 2(3)
        };

        int from = 0;

        while(len > 0) {
            array.add(from+1);
            len--;

            for(int to = 0; to < graph.length; to++) {
                if(graph[from][to] == 1) {
                    if(isTrue(array,to)) {
                        from = to;
                        break;
                    }

                    if(to==2 && len != 0) {
                        array.remove(array.size()-1);
                        len++;
                        from = 2;
                    }
                }
            }

        }
        for(Integer data : array) {
            result += data;
        }
        return result;
    }

    public static boolean isTrue(List<Integer> arr, int to) {

        if(arr.get(arr.size()-1) == to+1) {
            return false;
        }

        List<Integer> nextArray = new ArrayList<>(arr);
        nextArray.add(to+1);

        int i = 0;

        while (nextArray.size() > 2) {

            if(nextArray.size() % 2 == 0) {
                nextArray = nextArray.subList(i, nextArray.size());
            } else {
                nextArray = nextArray.subList(i+1,nextArray.size());
            }

            List<Integer> left = nextArray.subList(0, nextArray.size()/2);
            List<Integer> right = nextArray.subList(nextArray.size()/2, nextArray.size());

            if(Arrays.equals(left.toArray(), right.toArray()) && left.size() != 0 && right.size() != 0) {
                return false;
            }

            i=2;
        }

        return true;
    }


}
