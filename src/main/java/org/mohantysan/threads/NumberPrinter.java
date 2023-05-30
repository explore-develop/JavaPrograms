package org.mohantysan.threads;

public class NumberPrinter implements Runnable{

    private int number;

    public NumberPrinter(int number){
        this.number=number;
    }
    @Override
    public void run() {
        System.out.println("" + number + " is printed from Thread: " + Thread.currentThread().getName());
    }
}
