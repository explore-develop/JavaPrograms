package org.mohantysan.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinterWithExecutor {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executors.execute(numberPrinter);
        }
    }
}
