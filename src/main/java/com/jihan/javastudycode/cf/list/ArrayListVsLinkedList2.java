package com.jihan.javastudycode.cf.list;

import java.util.*;

public class ArrayListVsLinkedList2 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>(1000000);
        List<String> ll = new LinkedList<>();

        add(al);
        add(ll);

        System.out.println("=====접근시간 테스트=====");
        System.out.println("ArrayList :" + access(al));
        System.out.println("LinkedList :" + access(ll));
        System.out.println(new String("hello") == new String("hello"));
    }

    private static long access(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
             list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static void add(List<String> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i+"");
        }
    }
}
