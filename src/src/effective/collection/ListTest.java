package effective.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);


        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(6);

        Iterator<Integer> iterator2 = linkedList.iterator();

        while(iterator.hasNext()) {
            Integer str = iterator.next();
            System.out.println(str);
        }

        while(iterator2.hasNext()) {
            Integer num = iterator2.next();
            System.out.println(num);
        }

        linkedList.remove(2);

        for (Integer num : linkedList) {
            System.out.println(num);
        }


    }
}
