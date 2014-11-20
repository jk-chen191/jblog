package org.jewelknife.jblog.annotation;

import java.lang.annotation.*;

/**
 * Created by chen_yingbo on 11/20/14.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginStatusCheck {

    boolean needCheck() default true;

}
