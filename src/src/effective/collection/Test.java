package effective.collection;

public class Test<T, V> {

    T thing;
    V value;

    public Test(T thing, V value) {
        this.thing = thing;
        this.value = value;
    }

    public void print() {

        System.out.println(" T : " + thing);
        System.out.println(" V : " + value);
    }
}
