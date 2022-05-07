package test;

public class MathRandom {

    public static void main(String[] args) {

        // (int)((rand * (최대 - 최소 + 1)) + 최소)

        for(int i =0; i< 10; i++){
            int random =(int)((Math.random() * (10 - 8 + 1)) + 8);
            System.out.println(random);
        }

    }
}
