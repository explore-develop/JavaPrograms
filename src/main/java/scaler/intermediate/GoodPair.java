package scaler.intermediate;

import org.apache.commons.lang3.time.StopWatch;

import java.util.HashSet;

/*
Given an array A and an integer B.
A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
Check if any good pair exist or not.
 */
public class GoodPair {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 3};
        StopWatch stopwatch1 = StopWatch.createStarted();
        System.out.println(findPairUsingHashSet(arr, 5));
        stopwatch1.stop();
        System.out.println("Time taken by myFunctionCall: " + (double) stopwatch1.getNanoTime() / 1_000_000_000);

        StopWatch stopwatch2 = StopWatch.createStarted();
        System.out.println(findPairUsingBruteForce(arr, 5));
        stopwatch2.stop();
        System.out.println("Time taken by myFunctionCall: " + (double) stopwatch2.getNanoTime() / 1_000_000_000);
    }

    public static int findPairUsingBruteForce(int[] arr, int sum) {
        int pair = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] + arr[j] == sum) {
                    pair++;
                }
            }
        }
        return pair;
    }

    //    This Solutions doesn't work for i==j
    public static int findPairUsingHashSet(int[] arr, int sum) {
        int pair = 0;
        HashSet hashSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int remainingSum = sum - arr[i];
            if (hashSet.contains(remainingSum)) {
                pair++;
            }
            if (!hashSet.contains(arr[i])) {
                hashSet.add(arr[i]);
            }
        }
        return pair;
    }
}
