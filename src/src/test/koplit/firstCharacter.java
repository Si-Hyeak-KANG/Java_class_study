package test.koplit;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class firstCharacter {

    public static void main(String[] args) {

        String output = firstCharacter("The community at Code States might be the biggest asset");
        System.out.println(output); // --> "hw"

        Integer[] boxes = {3, 2, 4, 6, 1};
        ArrayList<Integer> newList = new ArrayList<Integer>();
    }

    // 내 풀이법 : StringTokenizer 활용
    public static String firstCharacter(String str) {

        StringTokenizer st = new StringTokenizer(str," ");
        String result = "";

        while(st.hasMoreTokens()) {

            result += st.nextToken().charAt(0);
        }

        return result;
    }

    // 레퍼런스 풀이법 : split 활용
    public static String firstCharacterRefer(String str) {

        if(str.length() == 0) return "";

        String[] words = str.split(" ");

        String result = "";

        for(int i = 0; i < words.length; i++) {
            result += words[i].charAt(0);
        }

        return result;
    }
}
