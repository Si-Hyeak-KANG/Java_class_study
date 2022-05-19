package annotation;

import java.lang.annotation.Target;

@SuppressWarnings("all")
public class AnnotationTest {

    public static void main(String[] args) {

        Test test = new Test();
        test.run = 1;
        System.out.println(test.depreRun());


    }
}

class Test extends Super{

    @Deprecated
    int run;

    @Override
    void run() {
    }

    @Deprecated
    int depreRun() {return run;}
}

class Super {
    void run() {}
}

@FunctionalInterface
interface Runnable {

    // abstract method 오직 하나
    void run();

    // default method 는 존재해도 상관없음
    default void pointtoo() {

    }
    // static method 는 존재해도 상관없음
    static void point() {

    }
}

