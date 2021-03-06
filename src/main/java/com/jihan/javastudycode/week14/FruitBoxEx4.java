package com.jihan.javastudycode.week14;

import java.util.Collections;

public class FruitBoxEx4 {
    public static void main(String[] args) {

        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
        FruitBox<Kiwi> kiwiBox = new FruitBox<>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("RedApple", 200));

        grapeBox.add(new Grape("GreenGrape", 400));
        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("RedGrape", 200));

        kiwiBox.add(new Kiwi("Kiwi", 400));
        kiwiBox.add(new Kiwi("Kiwi", 500));
        kiwiBox.add(new Kiwi("GoleKiwi", 200));

        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);

        Collections.sort(kiwiBox.getList());
        System.out.println(kiwiBox);

        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
