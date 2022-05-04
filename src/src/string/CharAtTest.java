package string;

public class CharAtTest {

    public static void main(String[] args) {

        String str = new String("java");

        System.out.println("문자열 : " + str);

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        String java = "java";

        System.out.println(java.charAt(0));
        System.out.println(java.charAt(1));
        System.out.println(java.charAt(2));
        System.out.println(java.charAt(3));

        System.out.println("\ncharAt() 메서드 호출 후 문자열 : " + str);
        System.out.println("\ncharAt() 메서드 호출 후 문자열 : " + java);

        System.out.println(java);
        System.out.println(str);

        Object object = new Object();
        System.out.println(object);


    }
}
