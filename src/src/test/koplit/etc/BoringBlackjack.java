package test.koplit.etc;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.StrictMath.sqrt;

public class BoringBlackjack {

    public static void main(String[] args) {

        int output = boringBlackjack(new int[]{1, 2, 3, 4});
        System.out.println(output); // 1

        int output2 = boringBlackjack(new int[]{2, 3, 4, 8, 13});
        System.out.println(output); // 3

    }

    // 받은 카드 중 3장을 뽑아 합했을 때 나오는 소수 개수
    public static int boringBlackjack(int[] cards) {

        int count = 0;
        for(int i = 0; i < cards.length; i++) {
            for(int j = i+1; j < cards.length; j++) {
                for(int k = j + 1; k < cards.length; k++) {

                    int sum = cards[i] + cards[j] + cards[k];

                    if(isDuplicate(sum)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static boolean isDuplicate(int num) {

        for(int i = 2; i <= sqrt(num); i++) {

            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
