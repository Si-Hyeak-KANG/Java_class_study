package test;

import java.util.ArrayList;
import java.util.Arrays;

public class PermuTest {
    public static void main(String[] args) {

        ArrayList<String[]> strings = permutationLoop();

        for (String[] string : strings) {
            System.out.println(Arrays.toString(string));
        }

    }

    public static ArrayList<String[]> permutationLoop() {

        String[] lookup = new String[]{"A","B","C","D","E"};

        ArrayList<String[]> result = new ArrayList<>();

        for(int i = 0; i < lookup.length; i++) {
            for(int j = 0; j < lookup.length; j++) {
                for(int k = 0; k < lookup.length; k++) {

                    if(i==j || j==k || k==i) continue;
                    String[] input = new String[]{lookup[i], lookup[j], lookup[k]};
                    result.add(input);
                }
            }
        }

        return result;
    }

}
