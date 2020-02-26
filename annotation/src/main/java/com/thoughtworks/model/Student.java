package com.thoughtworks.model;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Alias {
    String name() default "";
}

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Limit {
    int min() default Integer.MIN_VALUE;

    int max() default Integer.MAX_VALUE;
}

@Alias(name = "自定义")
public class Student {
    @Limit(min = 1, max = 140)
    private int age;
}

