package test.koplit.daily;

public class NumberSearch {

    public static void main(String[] args) {

        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output);
    }

    public static int numberSearch(String str) {
        // TODO:
        if(str.length() ==0) {
            return 0;
        }

        double sum = 0; // 수들의 합
        double count = 0; // 숫자의 개수

        String[] strArr = str.replace(" ","").split("");

        for(int i = 0; i < strArr.length; i++) {
            char text = strArr[i].charAt(0);

            if(text >= 48 && text <= 58) {
                count++;
                sum += text - '0';
            }
        }

        return (int) Math.round(sum / (strArr.length-count));
    }

}
