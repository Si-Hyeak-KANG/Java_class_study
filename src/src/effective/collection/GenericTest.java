package effective.collection;

public class GenericTest {

    public static void main(String[] args) {

        Basket basket = new Basket("String");

        basket.set("String");
        basket.set(1);

        String a = (String) basket.get(); // 가능한 변수 선언

        //Integer b = (Integer) basket.get(); // 문자열을 정수로 수동 타입 변환할 수 없기 때문에 ClassCastException 발생
        // Integer b = Integer.parseInt((String) basket.get());


        System.out.println(a);
    }
}

class Basket {

    private Object object;

    Basket(Object object) {
        this.object = object;
    }

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}