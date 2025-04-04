package org.example.thread;

public class ThreadExample extends Thread{
    public static void main(String[] args) throws InterruptedException {
        SumWorkerInterface sumWorkerInterface = new SumWorkerInterface("t1");
        SumWorkerInterface sumWorkerInterface1 = new SumWorkerInterface("t2");
        SumWorkerInterface sumWorkerInterface2 = new SumWorkerInterface("t3");
        Thread t1 = new Thread(sumWorkerInterface);
        Thread t2 = new Thread(sumWorkerInterface1);
        Thread t3 = new Thread(sumWorkerInterface2);
        t1.start();
        t1.join();
        t2.start();
//        t2.join();
        t3.start();
    }
}
