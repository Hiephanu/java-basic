package org.example.thread;

public class SumWorker extends Thread{
    private int start;
    private int end;
    private static final int sk=1;
    private long result;

    public SumWorker(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public long getResult() {
        return this.result;
    }
    @Override
    public void run() {
        result =0;
        for(int i=start; i<=end ; i++) {
            result = result +i;
        }
        System.out.println("Start from " + start + " end in " + end +" " + result);
    }
}
