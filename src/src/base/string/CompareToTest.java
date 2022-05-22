package base.string;

public class CompareToTest {

    public static void main(String[] args) {

        String str = new String("ABCD");

        System.out.println("문자열 : " + str);

        System.out.println(str.compareTo("bcefd"));
        System.out.println(str.compareTo("abcf") + "\n");
        System.out.println(str.compareTo("aBCD"));
        System.out.println(str.compareToIgnoreCase("Abcd"));

        System.out.println("compareTo() 메서드 호출 후 문자열 : " + str);
    }
}
