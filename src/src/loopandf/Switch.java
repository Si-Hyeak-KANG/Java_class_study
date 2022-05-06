package loopandf;

import java.util.Scanner;

public class Switch {

    static Scanner myInput = new Scanner(System.in);

    public static void main(String[] args) {

        String dice = myInput.nextLine();

        switch (dice) {
            case "1":
                System.out.println("1번");
                break; // 다음 case를 실행하지 않고, switch문 탈출!
            case "2":
                System.out.println("2번");
                break;
            case "3":
                System.out.println("3번");
                break;
            case "4":
                System.out.println("4번");
                break; // 다음 case를 실행하지 않고, switch문 탈출!
            case "5":
                System.out.println("5번");
                break;
            case "6":
                System.out.println("6번");
                break;
            default:
                System.out.println("없는 숫자!" + dice);
                break;
        }
    }
}
