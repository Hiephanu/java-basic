package org.example.collections;


import org.example.finalPackage.In;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAndLinkList {
    public static void testList() {
        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< 1000000;i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time );
    }

    public static void testLinkList() {
        long start = System.currentTimeMillis();
        List<Integer> list = new LinkedList<>();
        for(int i=0; i< 1000000;i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }
    public static void main(String[] args) {
//        testList();
        testLinkList();
    }
}
