package test;

public class StringCompareToChar {

    public static void main(String[] args) {

        String s1 = new String("안녕");
        String s2 = new String("안녕");

        String s3 = "안녕";
        String s4 = "안녕";

        System.out.println(s1);
        System.out.println(s2);

        if(s1 == s2) {
            System.out.println("참");
        }

        if(s1.equals(s2)) {
            System.out.println("참");
        }

        if(s4 == s3) { //나옴
            System.out.println("참");
        }

        char a = '안';
        char b = '녕';

        String test = "" + a + b;
        String test2 = String.valueOf(a) + String.valueOf(b);

        System.out.println(test);
        System.out.println(test2);

        System.out.println((int)a);
        System.out.println(a + b);
        System.out.println(""+a);
        System.out.println(Character.SIZE);
        System.out.println(Integer.SIZE);

    }



}
