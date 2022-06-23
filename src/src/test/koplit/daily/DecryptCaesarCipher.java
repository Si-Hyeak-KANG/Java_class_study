package test.koplit.daily;

public class DecryptCaesarCipher {

    public static void main(String[] args) {

        String output = decryptCaesarCipher("khoor", 3);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world

        output = decryptCaesarCipher("khoor zruog", 3);
        System.out.println(output); // --> hello world

        output = decryptCaesarCipher("d", 3);
        System.out.println(output); // --> hello world

        output = decryptCaesarCipher("mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd", 25);
        System.out.println(output); // now you are ready to move to immersive course

    }

    // 97~122
    public static String decryptCaesarCipher(String str, int secret) {
        // TODO:
        String result = "";

        if(str.length() == 0) {
            return result;
        }

        for(int i = 0; i < str.length(); i++) {

            char character = 0x20;
            if(str.charAt(i) != 0x20) {
                int value = str.charAt(i) - secret;
                if (value < 97) {
                    character = (char) ('z' - (96 - value));
                } else {
                    character = (char) value;
                }
            }

            result += character;
        }



        return result;
    }
}