package secondmonth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by expert on 8/27/18.
 */

//Customised annotation is mainly used to reduce dependencies
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface College {
    String name();
    String location();
}
