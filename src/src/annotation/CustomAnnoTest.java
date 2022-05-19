package annotation;

public class CustomAnnoTest {

    public static void main(String[] args) {

        Main test = new Main();
        System.out.println(test.i);
    }
}

// 적용대상이 TYPE인 경우
@CustomAnnotation
class Main {

    // 적용대상이 FIELD인 경우
    @CustomAnnotation(num = 3)
    int i;

    @CustomAnnotation
    int z;


}
