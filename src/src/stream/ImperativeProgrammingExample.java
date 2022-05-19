package stream;

import java.util.List;

//명령형 프로그래밍
public class ImperativeProgrammingExample {

    public static void main(String[] args) {
        //List에 있는 숫자들 중에서 4보다 큰 짝수의 합계 구하기
        List<Integer> numbers = List.of(1, 3, 6, 7, 8, 11);
        Integer sum = 0;

        for (Integer number : numbers) {
            if(number > 4 && number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println("# 명령형 프로그래밍 : " + sum);
    }
}
