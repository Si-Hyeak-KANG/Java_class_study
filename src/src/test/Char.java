package test;

import java.util.Scanner;

public class Char {

    Scanner sc = new Scanner(System.in);

    class Test {
        int input = sc.nextInt();
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.reverse();

        char c1 = 'A';
        char c2 = '\u0000';
        char c3 = ' ';
        String var = 1 + "-";

        System.out.println((char)(c1 + 1));

        System.out.println(c2);

        System.out.println('\u0000');
        System.out.println(1 + "-");
        System.out.println(var);
        String grade;
    }
}
