package effective.annotation.custom;

import java.lang.reflect.Field;

public class BackendInfoUtil {
    public static void getBackendInfo(Class<?> InfoExample) {

        String strBackendFramework = "백엔드 프레임워크 : ";

        Field[] fields = InfoExample.getDeclaredFields();

        for (Field field : fields) {

            if(field.isAnnotationPresent(BackendFramework.class)) {
                BackendFramework backendFramework = field.getAnnotation(BackendFramework.class);
                strBackendFramework = strBackendFramework + backendFramework.backendFramework().toString();
                System.out.println(strBackendFramework);
            }
        }
    }
}
