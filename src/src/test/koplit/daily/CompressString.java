package test.koplit.daily;

import java.util.ArrayList;
import java.util.HashMap;

public class CompressString {

    public static String compressString(String str) {
        // TODO:
        String result = "";

        if(str.length() == 0) {
            return result;
        }

        String[] arr = new String[str.length()];
        int index = -1;

        String[] split = str.split("");
        String part = "";

        for(int i = 0 ; i < split.length; i++) {

            if(part.equals(split[i])) {
                arr[index] += split[i];
            } else {
                index++;
                arr[index] = split[i];
                part = split[i];
            }
        } // "www", "gg", "o", "pp", "o", "pppp"

        for (String data : arr) {
            if(data == null) {
                break;
            } else if(data.length() >= 3) {
                result += String.valueOf(data.length()) + data.charAt(0);
            } else {
                result += data;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }
}
