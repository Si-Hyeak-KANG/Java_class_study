package test.koplit.daily;

import java.util.ArrayList;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        boolean output = balancedBrackets("(");
        System.out.println(output); // // -> false

        output = balancedBrackets("()");
        System.out.println(output);

        output = balancedBrackets("())()()");
        System.out.println(output);
    }

    public static boolean balancedBrackets(String str) {
        // TODO:

        ArrayList<Integer> stack = new ArrayList<>();

        String[] split = str.split("");

        for(int i = 0; i < split.length; i++) {

            switch (split[i]) {
                case "(":
                    stack.add(0);
                    break;
                case "{":
                    stack.add(1);
                    break;
                case "[":
                    stack.add(2);
                    break;

                case ")":
                    if(stack.size()==0 || stack.get(stack.size()-1)!=0) {
                        return false;
                    }
                    stack.remove(stack.size()-1);
                    break;
                case "}":
                    if(stack.size()==0 || stack.get(stack.size()-1)!=1) {
                        return false;
                    }
                    stack.remove(stack.size()-1);
                    break;
                case "]":
                    if(stack.size()==0 || stack.get(stack.size()-1)!=2) {
                        return false;
                    }
                    stack.remove(stack.size()-1);
                    break;
            }
        }

        if(stack.size() > 0) {
            return false;
        }

        return true;
    }
}
