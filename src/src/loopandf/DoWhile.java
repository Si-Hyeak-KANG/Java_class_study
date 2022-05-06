package loopandf;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        int input,randomNum = 0;

        randomNum = (int)(Math.random() * 10) + 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1과 10 사이의 정수를 입력하세요.");
            input = sc.nextInt();

            if(input > randomNum) {
                System.out.println("더 작은 정수를 입력하세요");
            } else if(input < randomNum) {
                System.out.println("더 큰 정수를 입력하세요");
            }
        } while(input != randomNum);
            System.out.println(randomNum + " 정답입니다.");

    }
}
