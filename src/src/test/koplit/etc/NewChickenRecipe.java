package test.koplit.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NewChickenRecipe {

    public static void main(String[] args) {
        ArrayList<Integer[]> output1 = newChickenRecipe(new int[]{1, 10, 1100, 1111}, 2);
        System.out.println(output1);

        ArrayList<Integer[]> output2 = newChickenRecipe(new int[]{10000, 10, 1}, 3);
        System.out.println(output2);

        ArrayList<Integer[]> output3 = newChickenRecipe(new int[]{11, 1, 10, 1111111111, 10000}, 4);
        System.out.println(output3);
    }

    public static ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        // TODO:

        Integer[] newStuff = new Integer[stuffArr.length];
        int changeIdx = stuffArr.length - 1;
        int index = 0;
        boolean find = false;

        for (int i = 0; i < stuffArr.length; i++) {
            if (stuffArr[i] % 1000 == 0) {

                if (i == changeIdx) {
                    index = i;
                    find = true;
                    break;
                }

                int temp = stuffArr[i];
                stuffArr[i] = stuffArr[changeIdx];
                stuffArr[changeIdx] = temp;
                changeIdx -= 1;
            }
        }
        if(!find) {
            changeIdx = stuffArr.length;
        }

        for(int i = 0; i < stuffArr.length; i++) {
            newStuff[i] = stuffArr[i];
        }

        newStuff = Arrays.copyOf(newStuff,changeIdx);

        if(newStuff.length < choiceNum) {
            return null;
        }
        Arrays.sort(newStuff);

        ArrayList<Integer[]> result = new ArrayList<>();

        result = permutation(newStuff, choiceNum, new Integer[]{}, result,0);
        return result;

    }

    public static ArrayList<Integer[]> permutation(Integer[] stuff ,int choiceNum, Integer[] tempArr, ArrayList<Integer[]> result,int subIndex) {

        if(tempArr.length == choiceNum) {
            result.add(tempArr);
            return result;
        }

        for(int i = subIndex; i < stuff.length; i++) {

            int value = stuff[i];
            Integer[] conArr = new Integer[]{};
            conArr = Arrays.copyOf(tempArr,tempArr.length+1);
            conArr[conArr.length-1] = value;

            result = permutation(stuff, choiceNum, conArr, result,subIndex+1);

        }

        return result;
    }
}
