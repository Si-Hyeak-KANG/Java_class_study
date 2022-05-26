package dataStructure;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1); // 데이터 추가
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek()); // 가장 위에 있는 데이터 조회

        System.out.println(stack.pop()); // 데이터 출력 후 제거

        System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}
