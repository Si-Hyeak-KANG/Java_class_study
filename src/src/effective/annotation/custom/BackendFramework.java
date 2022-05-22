package effective.annotation.custom;

import java.lang.annotation.*;

@Target(ElementType.FIELD) // 애너테이션이 적용 가능한 대상을 FIELD로 정함.
@Retention(RetentionPolicy.RUNTIME) // 코드 실행시 까지 애너테이션이 유지되게 정해줌
@Documented // 애너테이션 정보를 javadoc 으로 작성된 문서에 포함
public @interface BackendFramework {

    enum Frameworks {SPRING, DJANGO, EXPRESS}

    Frameworks backendFramework() default Frameworks.DJANGO;
}
