package test.koplit.daily;

public class LetterCapitalize {

    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1); // "Hello World"
        String output2 = letterCapitalize("what a wonderful life");
        System.out.println(output2); // "What A Wonderful Life"
        String output3 = letterCapitalize("java  is good ");
        System.out.println(output3); // "Java  Is Good "
    }

    public static String letterCapitalize(String str) {
        // TODO:
        String result = "";

        if(str.length()==0) {
            return result;
        }

        String[] split = str.split(" ");

        for(int i = 0; i< split.length; i++) {
            if(split[i].length() == 0) {
                split[i] = "";
            } else {
                char oldChar = split[i].charAt(0);

                char newChar = Character.toUpperCase(oldChar);
                split[i] = split[i].replace(oldChar, newChar);
            }
        }

        result=String.join(" ", split);

        return result;
    }
}
