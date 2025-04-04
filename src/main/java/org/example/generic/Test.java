package org.example.generic;

import org.example.finalPackage.In;

public class Test {
    public static void main(String[] args) {
        GenericClass<String,Integer, Integer,Integer> stringGenericClass = new GenericClass<>();
        stringGenericClass.print("Hiệp", 1,2,3);
    }
}
