package org.example.finalPackage;

public class ImplementFinal extends  FinalClass{
    @Override
    public void finalMethod() {
        System.out.println("Not final");
    }

    public static void main(String[] args) {
        ImplementFinal implementFinal =  new ImplementFinal();
        implementFinal.finalMethod();
    }
}
