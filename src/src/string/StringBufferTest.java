package string;

public class StringBufferTest {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Java Programming!!");

        System.out.println("문자열 : " + str);
        System.out.println(str.capacity());
        System.out.println(str.insert(4,"Script"));
        System.out.println("insert 메서드 호출 후 문자열 : " + str);

    }
}