package effective.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Documented
@Target({FIELD, TYPE, TYPE_USE})
@Retention(RetentionPolicy.CLASS)
public @interface CustomAnnotation {

    int num() default 5;

}
