package com.jihan.javastudycode.week15;

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {};
        Object obj = (MyFunction)(() -> {});
        String str = ((Object)(MyFunction)(() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction)(() -> {}));
        System.out.println(((Object)(MyFunction)(()->{})).toString());
    }
}
