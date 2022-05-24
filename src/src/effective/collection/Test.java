package effective.collection;

public class Test<T, E> {

    T thing;
    E value;

    public Test(T thing, E value) {
        this.thing = thing;
        this.value = value;
    }

    public void print() {

        System.out.println(" T : " + thing);
        System.out.println(" E : " + value);
    }
}
