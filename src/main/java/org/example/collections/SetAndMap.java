package org.example.collections;

import java.util.*;

public class SetAndMap {
    public static void main(String[] args) {
//        int[] a = new int[] {1,3,4,5,6};
//        int[] b = Arrays.copyOf(a, 10);
//        for (int i: b) {
//            System.out.println(i);
//        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2,3);
        map.put(4,5);
        map.put(1,2);
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.forEach(System.out::println);
        System.out.println();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
