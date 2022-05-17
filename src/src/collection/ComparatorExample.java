package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee2 {
    int id;
    String name, department;

    public Employee2(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}

class SortById implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return 0;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Employee2> workers = new ArrayList<>();

        Employee2 employee1 = new Employee2(11, "Kim Coding","Software Engineering");
        Employee2 employee2 = new Employee2(5, "Lee Java","Growth Marketing");
        Employee2 employee3 = new Employee2(7, "Park Hacker","Software Engineering");

        workers.add(employee1);
        workers.add(employee2);
        workers.add(employee3);

        for (Employee2 worker : workers) {
            System.out.println(worker.id + " " + worker.name + worker.department);
        }

        Collections.sort(workers, new SortById());

        ArrayList<Integer> test = new ArrayList<>();

        test.add(3);
        test.add(1);
        test.add(5);

        SortById sbi = new SortById();
        Collections.sort(workers, Collections.reverseOrder());

        for (Employee2 worker : workers) {
            System.out.println(worker.id + " " + worker.name + worker.department);
        }

        System.out.println(test);
    }
}
