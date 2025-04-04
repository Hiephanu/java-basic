//package org.example.lambda;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeFormatterBuilder;
//import java.util.*;
//
//public class lambdaExample {
//    public static void main(String[] args) {
//        SumInterface sumInterface = (a, b) -> {
//            int sum = a+b;
//            System.out.println("Sum :" +sum);
//            return  a+b;
//        };
//        sumInterface.sumOfNumber(2,3);
//        Optional<Integer> test = Optional.empty();
//        Date date = new Date();
//
//        LocalDateTime local = LocalDateTime.now();
//
//        SumIntefaceImpl sumInteface = new SumIntefaceImpl();
//        sumInteface.sumOfNumber(2,3);
//
//
//
//
//        sumInterface.sumOfNumber(2,3);
//        List<Integer> list = Arrays.asList(11,1,2,3,4,5,6,7,8,9,10);
//        Integer[] arr  = new Integer[0];
//        Arrays.sort(arr);
//        for(int i : arr) {
//            System.out.println(i);
//        }
//        int a = list.stream()
//                .filter(integer -> integer > 2)
//                .reduce(0, (x, y) -> x + y);
//
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(2);
//
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(0);
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.removeIf(i -> i>2);
//        list1.forEach(System.out::println);
//    }
//}
