package org.example.thread;

public class SumWorkerInterface implements Runnable{
    private String thread;

    public SumWorkerInterface(String s) {
        this.thread = s;
    }
    @Override
    public void run() {
        System.out.println("Thread is running" +  thread);
    }

}
