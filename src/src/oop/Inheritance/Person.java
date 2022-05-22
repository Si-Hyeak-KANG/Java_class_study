package oop.Inheritance;

public class Person {

    private String name;
    private int age;

    private void learn() {
        System.out.println("공부");
    }

    public void walk() {
        System.out.println("걷기");

    }

    public void eat() {
        System.out.println("먹기");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 0) {
            return;
        }
        this.age = age;
    }

}

