package effective.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
public @interface ToDos {
    //ToDo[] value();
}
