package org.mohantysan.mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//https://github.com/Naman-Bhalla/threadsMar23/tree/master/src/main/java/com/scaler/mergesort
public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = List.of(10, 3, 4, 5, 6, 2, 3, 4, 56);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arrayToSort, executorService);
        Future<List<Integer>> sortedListFuture = executorService.submit(sorter);
        List<Integer> sortedList = sortedListFuture.get();

        for (Integer elem : sortedList) {
            System.out.println(elem);
        }
    }
}
