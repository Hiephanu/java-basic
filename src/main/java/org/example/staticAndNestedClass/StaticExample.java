package org.example.staticAndNestedClass;

public class StaticExample {
    private static final  int a =5;
    private int b=5;

    private static void printA() {
        System.out.println(a);
    }

    public void print() {
        printA();
        System.out.println("Hello");
    }

    public static void main(String[] args) {

    }
}
