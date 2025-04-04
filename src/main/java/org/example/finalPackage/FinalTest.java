package org.example.finalPackage;

public class FinalTest implements In{
    @Override
    public void getAll() {

    }
    @Override
    public final int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sum(int a, int b, int c) {
        return a+b+c;
    }
}
