package test.koplit.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String output = barcode(3);
        System.out.println(output); // "121"

        output = barcode(4);
        System.out.println(output); // "1213"

        output = barcode(7);
        System.out.println(output); // "1213121"

        output = barcode(8);
        System.out.println(output); // "12131231"

        output = barcode(20);
        System.out.println(output); // "12131231321231213123"
    }

    /**
     * len 글자수
     */
    public static String barcode(int len) {
        // TODO:
        String result = "";
        List<Integer> array = new ArrayList<>();

        int[][] graph = new int[][]{
                {0, 1, 1}, // index : 0 (1)
                {1, 0, 1}, // index : 1 (2)
                {1, 1, 0} // index : 2(3)
        };

        int from = 0; // 출발 인덱스

        while (len > 0) {
            array.add(from + 1); // 인덱스이기 때문에 배열에는 +1한 후 add
            len--; // 한 칸 채웠으니 입력받은 len 에서 -1한다.

            // 3X3 그래프 이내에서 반복 -> to = 0,1,2
            for (int to = 0; to < graph.length; to++) {

                // (from, to)가 1일 때 조건으로 들어간다.
                if (graph[from][to] == 1) {

                    // to로 갈 수 있는지 체크 (isTrue 메서드 사용)
                    if (isTrue(array, to)) {
                        from = to;
                        break;
                    }

                    if (to == 2 && len != 0) {
                        array.remove(array.size() - 1);
                        len++;
                        from = 2;
                    }
                }
            }

        }
        for (Integer data : array) {
            result += data;
        }
        return result;
    }

    /**
     *
     * @param arr
     * @param to
     * @return
     */
    public static boolean isTrue(List<Integer> arr, int to) {

        // 배열 가장 위에 있는 값과 to+1의 값이 같으면 false
        // ex) 11, 22, 33 같은 상황
        if (arr.get(arr.size() - 1) == to + 1) {
            return false;
        }

        // 입력받은 배열을 새로운 리스트로 만들어준다.
        List<Integer> nextArray = new ArrayList<>(arr);

        // 새로만든 리스트에 to+1 을 추가
        nextArray.add(to + 1);

        int i = 0;

        while (nextArray.size() > 2) {

            // nextArray가 짝수일경우
            if (nextArray.size() % 2 == 0) {
                nextArray = nextArray.subList(i, nextArray.size());
            } else {
                // 홀수일 경우
                nextArray = nextArray.subList(i + 1, nextArray.size());
            }

            // nextArray 를 절반으로 나누고, 각각 새로운 리스트에 저장
            List<Integer> left = nextArray.subList(0, nextArray.size() / 2);
            List<Integer> right = nextArray.subList(nextArray.size() / 2, nextArray.size());

            // left와 right의 사이즈가 0이 아니면서, left 배열과 right 배열 내의 데이터 비교
            if (Arrays.equals(left.toArray(), right.toArray()) && left.size() != 0 && right.size() != 0) {

                // 같으면 false 반환하며, isTrue 메서드 종료
                return false;
            }

            // 배열의 앞에 있는 두개 인덱스를 지우기 위해 i +2
            i = 2;
        }

        return true;
    }
}
