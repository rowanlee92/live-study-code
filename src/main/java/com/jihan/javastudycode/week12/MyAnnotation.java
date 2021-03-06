package com.jihan.javastudycode.week12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({FIELD, TYPE, TYPE_USE})    // 적용대상이 FIELD, TYPE, TYPE_USE
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation { }

@MyAnnotation
class MyClass {

    @MyAnnotation
    int i;

    @MyAnnotation
    MyClass mc;

}
