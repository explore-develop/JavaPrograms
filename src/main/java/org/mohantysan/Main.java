package org.mohantysan;

import org.mohantysan.threads.HelloWorldPrinter;
import org.mohantysan.threads.NumberPrinter;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        Thread thread = new Thread(helloWorldPrinter);
//        thread.start();
//        helloWorldPrinter.run();
        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter= new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}