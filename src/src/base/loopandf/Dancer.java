package base.loopandf;

import oop.Inheritance.Person;

public class Dancer extends Person {

    String groupName;

    void dancing() {
        System.out.println("춤");
    }

    @Override
    public void walk() {
        System.out.println("춤추며 걷기");
    }




}
