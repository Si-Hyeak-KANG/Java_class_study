package test.koplit.daily;

public class ReadVertically {

    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolrd"
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"

        input = new String[]{
                "hi",
                "wolrd"
        };
        output = readVertically(input);
        System.out.println(output); // --> "hwiolrd"

        input = new String[]{
                "hi",
                "test",
                "close"
        };
        output = readVertically(input);
        System.out.println(output); // --> "htciel so ts  e"
    }

    public static String readVertically(String[] arr) {
        // TODO:
        String result = "";
        int newStrLength = 0;

        for(int i = 0; i < arr.length; i++) {
            newStrLength += arr[i].length();
        }

        int column = 0; // 열
        int row = 0; // 행

        while(newStrLength-- > 0) {

            if(column == arr.length) {
                column = 0;
                row++;
            }

            while(row >= arr[column].length()) {

                column++;
            }

            result += String.valueOf(arr[column].charAt(row));

            column++;
        }

        return result;
    }
}
