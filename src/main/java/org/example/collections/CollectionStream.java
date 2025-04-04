package org.example.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionStream {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for(int i=0; i< 10;i++) {
            integers.add(i);
        }

        List<Integer> even = integers.stream().filter(number -> number % 2 == 0).toList();
        int sum = even.stream().reduce(0, (a,b) -> a+b);
        System.out.println(sum);
        int size = 1000000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long arrayListAddTime = System.currentTimeMillis() - startTime;
        System.out.println("Thời gian thêm vào ArrayList: " + arrayListAddTime + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        long linkedListAddTime = System.currentTimeMillis() - startTime;
        System.out.println("Thời gian thêm vào LinkedList: " + linkedListAddTime + "ms");

        startTime = System.currentTimeMillis();
        arrayList.get(size - 1);
        long arrayListGetTime = System.currentTimeMillis() - startTime;
        System.out.println("Thời gian truy cập cuối cùng ArrayList: " + arrayListGetTime + "ms");

        startTime = System.currentTimeMillis();
        linkedList.get(size - 1);
        long linkedListGetTime = System.currentTimeMillis() - startTime;
        System.out.println("Thời gian truy cập cuối cùng LinkedList: " + linkedListGetTime + "ms");
    }
}
