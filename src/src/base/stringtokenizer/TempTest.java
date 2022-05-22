package base.stringtokenizer;

import java.util.Scanner;

public class TempTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(sc.hasNextInt());

        int c = sc.nextInt();

        System.out.println(sc.hasNextInt());

        while(sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A);
            System.out.println(B);
        }
    }
}