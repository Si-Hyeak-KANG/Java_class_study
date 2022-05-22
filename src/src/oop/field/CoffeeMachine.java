package oop.field;


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

    public String getName() {

        return this.name;
    }

    public void getBeans() {

        System.out.println(beans);
    }

    public String getAll(String name, String name2) {

        String result = name + "가 사용하는 원두는 " + name2;

        return result;
    }

}

class Test {

    public static void main(String[] args) {

        // 커피 머신 생성
        CoffeeMachine machineA = new CoffeeMachine();

        // 각 변수에 값 할당
        machineA.name = "커피머신A";
        machineA.beans = "아라비카";

        // 매개변수에 값을 입력한 메서드를 호출한 후 String 변수에 할당
        String str = machineA.getAll(machineA.name, machineA.beans);

        // String 변수 str 호출
        System.out.println(str);
    }
}
