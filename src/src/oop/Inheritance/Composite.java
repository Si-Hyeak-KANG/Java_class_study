package oop.Inheritance;

public class Composite {

    int id;
    String name;
    Address address;

    public Composite(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.country);
    }

    public static void main(String[] args) {

        Address address1 = new Address("서울","한국");
        Address address2 = new Address("도쿄","일본");

        Composite employee = new Composite(1, "김코딩", address1);
        Composite employee2 = new Composite(2, "박해커", address2);

        employee.showInfo();
        employee2.showInfo();
    }
}
