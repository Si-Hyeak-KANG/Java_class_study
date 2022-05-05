package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTest {

    public static void main(String[] args) {

        String str = "This is a string example using StringTokenizer";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st);
        System.out.println();

        System.out.println("total tokens:" + st.countTokens());

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println("total tokens:" + st.countTokens());
    }
}
