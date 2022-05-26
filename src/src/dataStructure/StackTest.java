package dataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        ArrayList<Stack> output = browserStack(actions, start);

        System.out.println(output);
    }

    public static ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        // TODO:
        // 1. Start를 확인하고 current 스택에 넣는다.
        current.push(start);

        // case1: 배열 내에 아무 것도 없을 경우 -> A
        // case2: 배열에 데이터가 있을 겨우

        // 2. 배열을 순회한다.
        for(String value : actions) {
            // case2-1 : 숫자인지 대문자인지 체크
            if(check(value)) {
                // start의 값을 prev스택 , 해당 대문자를 curret 스택에 넣기
                prevStack.push(current.pop());
                current.push(value);

                if(!nextStack.isEmpty()) {
                    nextStack.clear();
                }

            } else {

                    if(value.equals("-1")){

                        if(!prevStack.isEmpty()) {
                            nextStack.push(current.pop());
                            current.push(prevStack.pop());
                        }

                    } else {

                        if(!nextStack.isEmpty() ) {
                            prevStack.push(current.pop());
                            current.push(nextStack.pop());
                        }
                    }


            }
        }

        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;
    }

    // 숫자인지 대문자인지 체크 -> 숫자 : false ,  대문자 : true
    // 대문자 : 65~90
    public static boolean check(String str) {

        char ch = str.charAt(0);

        if( ch >= 65 && ch <= 90 ) return true;

        return false;
    }


}
