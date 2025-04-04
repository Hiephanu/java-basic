package org.example.oop;

public class InterfaceAndAbstractExample extends SimpleAbstract implements SimpleInterface{
    @Override
    public void print() {
        System.out.println("Hiep Doan");
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }


    @Override
    public int sum(int a,int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        InterfaceAndAbstractExample interfaceAndAbstractExample = new InterfaceAndAbstractExample();
        interfaceAndAbstractExample.print();
        System.out.println(interfaceAndAbstractExample.sum(4,5,6));
    }
}
