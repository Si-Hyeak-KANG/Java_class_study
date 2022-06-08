package test.koplit.daily;

public class InsertDash {

    public static void main(String[] args) {

        String output = insertDash("6734611997679419173");
        System.out.println(output); // --> 4547-9-3
    }

    public static String insertDash(String str) {
        // TODO:

        if(str.length() == 0) {
            return null;
        }

        boolean continueFind = false;
        String result = "";
        String[] arr = str.split("");

        for(int i =0; i < arr.length; i++) {

            char curr = arr[i].charAt(0);

            if (curr % 2 == 0) {
                continueFind = false;

            } else {

                if(continueFind == true) {
                    String replace = "-" + curr;
                    arr[i] = replace;
                }

                continueFind = true;

            }
        }
        return String.join("",arr);

    }
}

