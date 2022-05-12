package Inheritance;

import loopandf.Dancer;

public class PersonTest {

    public static void main(String[] args) {

        Person p = new Person();

        p.setName("현석");
        p.setAge(2);

        System.out.println(p.getName() + ", " + p.getAge() );

    }
}

