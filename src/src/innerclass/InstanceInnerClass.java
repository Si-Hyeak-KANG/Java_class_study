package innerclass;


class Outer { // 외부 클래스

    private int num = 1; // 외부 클래스 private 변수
    private static int sNum = 2;// 외부 클래스 정적 변수

    private InClass inClass;// 내부 클래스 자료형 변수

    public Outer() {
        inClass = new InClass(); // 외부 클래스 생성자
    }

    static class InClass { // 인스턴스 내부 클래스

        private int inNum = 10; // 내부 클래스의 인스턴스 변수

        void Test() {
            // System.out.println("Outer num = " + num + "(외부 클래스의 인스턴스 변수)");
            // static 클래스에서는 정적 멤버만 사용 가능
            System.out.println("Outer sNum = " + sNum + "(외부 클래스의 정적 변수)");

        }
    }

    public void testClass() {
        inClass.Test();
    }

    public void test2() {
        System.out.println("sNum : " + sNum);
        System.out.println("Num : " + num);
        System.out.println("inNum : " +  inClass.inNum);
    }
}

public class InstanceInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InClass in = new Outer.InClass();
        System.out.println("외부 클래스 사용하여 내부 클래스 기능 호출");
        outer.testClass();
        System.out.println();
        outer.test2();
        System.out.println();
        in.Test();


    }
}
