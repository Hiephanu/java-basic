package org.example.collections;

import org.example.finalPackage.In;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Collection {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,1,4,5,2);

//        for(int i = 0;  i < list.size(); i ++ ) {
//            if(list.get(i) > 2) {
//                System.out.println(list.get(i));
//            }
//        }
//
//       for(Integer i : list) {
//           if (i > 2) {
//               System.out.println(i);
//           }
//       }

        //cấu trúc ntn dùng ntn , tại sao
       List<Integer> result = list.stream().filter((i) -> i > 2).toList();
       //pipeline
    }
}
