package oop.Abstraction;

abstract public class Human {

    int age;

    Human() {

    }

    void setAge(int age) {
        this.age = age;
    }

    abstract void tell();
}
