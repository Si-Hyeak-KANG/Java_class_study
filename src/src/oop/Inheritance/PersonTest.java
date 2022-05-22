package oop.Inheritance;

public class PersonTest {

    public static void main(String[] args) {

        Person p = new Person();

        p.setName("건휘");
        p.setAge(-1);

        System.out.println(p.getName() + ", " + p.getAge());
    }
}

