package org.example.thread;

import java.util.Arrays;

public class SynchronizedAndAsynchronized {
    private int count = 0;
    public synchronized void increaseCount() {
        count++;
    }
    public void increaseCountA() {
        count++;
    }
    public synchronized int getCount() {
        return  count;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedAndAsynchronized test=  new SynchronizedAndAsynchronized();
        float a = 1.55f;
        float b =0.005f;
        Thread[] threads = new Thread[5];
        long time = System.nanoTime();
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10000000; j++) {
                    test.increaseCountA();
                }
            });
            threads[i].start();
        }

        for(int i=0;i<5;i++) {
            threads[i].join();
        }
        System.out.println(test.getCount());
        long end = System.nanoTime();
        System.out.println((end-time)/1_000_000_000.0);
    }
}
