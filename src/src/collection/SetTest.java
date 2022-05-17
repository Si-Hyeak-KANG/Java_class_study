package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        HashSet<String> test = new HashSet<>();

        test.add("Java");
        test.add("Python");
        test.add("Javascript");
        test.add("c++");
        test.add("Kotlin");
        test.add("Ruby");
        test.add("Java");
        test.add("spring");

        Iterator it = test.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        TreeSet<String> workers = new TreeSet<>();

        workers.add("Zang");
        workers.add("Lee Java");
        workers.add("Park Jisung");
        workers.add("Kim Coding");

        System.out.println(workers);
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("Park"));
        System.out.println(workers.higher("Java"));
        System.out.println(workers.subSet("Kim", "Park"));
    }
}
