package test.koplit.etc;

import java.util.ArrayList;
import java.util.Arrays;

public class LockPaperScissorsTest {

    public static void main(String[] args) {
        ArrayList<String[]> output = rockPaperScissors(5);

        for (String[] strings : output) {

            System.out.println(Arrays.toString(strings));
        }

    }

    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        //결과를 담을 ArrayList를 선언합니다.
        ArrayList<String[]> outcomes = new ArrayList<>();
        // 함수를 실행하여 반환된 결과를 다시 반환합니다.
        return permutation(rounds, new String[]{}, outcomes);
    }

    public static ArrayList<String[]> permutation(int roundsToGo, String[] playedSoFar, ArrayList<String[]> outcomes) {

        if(roundsToGo == 0) {
            outcomes.add(playedSoFar);
            return outcomes;
        }

        String[] rps = new String[]{"rock", "paper", "scissors"};


        for(int i = 0; i < rps.length; i++) {

            String currentPlay = rps[i];

            String[] concatArray = Arrays.copyOf(playedSoFar, playedSoFar.length + 1);  //배열의 크기를 하나 늘리고, currentPlay를 요소로 넣어줍니다.
            concatArray[concatArray.length - 1] = currentPlay;

            outcomes = permutation(roundsToGo - 1, concatArray, outcomes);
        }

        // outcomes를 반환합니다.
        return outcomes;
    }
}
