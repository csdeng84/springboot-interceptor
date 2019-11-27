package com.csdeng.springbootinterceptor.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoIdempotent {
    String value() default "";
}
