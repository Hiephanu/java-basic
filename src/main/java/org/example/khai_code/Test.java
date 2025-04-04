package org.example.khai_code;

public class Test implements  Cloneable{
    int a;
    int b;
    public  Test (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Test te = new Test(1,2);
        System.out.println(te.a);
        System.out.println(te.a);
        try {

        } catch (Exception e) {

        }
    }

    public void test (Test t) {
        t.a =5;
    }
}
