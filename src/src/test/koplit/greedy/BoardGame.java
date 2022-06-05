package test.koplit.greedy;

import java.util.Arrays;

public class BoardGame {

    public static void main(String[] args) {

        int[][] board3 = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        Integer output3 = boardGame(board3, "DDRRRUDUDUD");
        System.out.println(output3); // 0
    }

    static int X; // X 축
    static int Y; // Y 축

    public static Integer boardGame(int[][] board, String operation) {
        // TODO:

        Integer[] arr = new Integer[operation.length()];

        for(int i = 0; i < operation.length(); i++) {

            move(operation.charAt(i));

            if(X < 0 || Y < 0 || X >= board.length || Y >= board.length) {

                return null;
            } else {
                arr[i] = board[0+Y][0+X];
            }

        }

        return Arrays.stream(arr).mapToInt(n->n).sum();

    }

    public static void move(char ch) {

        if(ch == 'U') {
            Y -= 1;
        } else if(ch == 'D') {
            Y += 1;
        } else if(ch == 'R') {
            X += 1;
        } else if(ch == 'L') {
            X -= 1;
        }
    }
}
