package field;


// 1. 커피 머신 클래스(설계도) 입니다.
public class CoffeeMachine {

    // 2. 필드 선언: 재료 그릇을 만들어줍니다.

    String name; // 이름
    static String beans; // 상용할 원두 종류
    int brewGroupNum; // 커피 추출구 개수
    int cupCapacity; // 얹을 수 있는 컵 개수

    boolean coffeeBtn; // 커피 버튼
    boolean waterBtn; // 물 버튼
    boolean milkBtn; // 우유 버튼

}

class Test {

    public static void main(String[] args) {

        // 첫 번째 커피 머신 생성
        CoffeeMachine machineA = new CoffeeMachine();

        // 두 번째 커피 머신 생성
        CoffeeMachine machineB = new CoffeeMachine();

        // 세 번째 커피 머신 생성
        CoffeeMachine machineC = new CoffeeMachine();

        machineA.name = "커피머신A"; // 첫 번째 커피 머신의 이름 변수에 "커피머신A" 저장(할당)
        machineB.name = "커피머신B"; // 두 번째 커피 머신의 이름 변수에 "커피머신B" 저장(할당)
        machineC.name = "커피머신C"; // 세 번째 커피 머신의 이름 변수에 "커피머신C" 저장(할당)

        machineA.beans = "아라비카";

        System.out.println(machineA.beans);
        System.out.println(machineB.beans);
        System.out.println(machineC.beans);

        System.out.println(CoffeeMachine.beans);
    }
}
