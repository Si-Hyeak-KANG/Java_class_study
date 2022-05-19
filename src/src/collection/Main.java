package collection;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Random random = new Random("String");

        String a = (String) random.get();
        Integer b = (Integer) random.get();


    }
}

class Random {

    private Object object;

    public Random() {
    }

    public Random(Object object) {
        this.object = object;
    }

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}
