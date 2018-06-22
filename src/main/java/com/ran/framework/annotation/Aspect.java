package com.ran.framework.annotation;

import java.lang.annotation.*;

/**
 * Created By nature on 2018/6/21
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     * @return
     */
    Class<? extends Annotation> value();
}
