package org.example.finalPackage;

public class K2 implements In{
    @Override
    public void getAll() {

    }

    @Override
    public int sum(int a, int b) {
        return a+b*b;
    }

    @Override
    public int sum(int a, int b, int c) {
        return 0;
    }

    public static void main(String[] args) {
        In k2 = new K2();
        In finalTest= new FinalTest();
        FinalClass finalClass = new FinalClass();
        finalClass.finalMethod();

        System.out.println(k2.sum(1,2));
        System.out.println(finalTest.sum(1,2));
    }
}
