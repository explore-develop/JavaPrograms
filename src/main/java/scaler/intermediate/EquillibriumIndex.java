package scaler.intermediate;

import java.util.ArrayList;
import java.util.Arrays;

/*
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
 */
public class EquillibriumIndex {
    public static void main(String[] args) {
        int arr1[] = {-7, 1, 5, 2, -4, 3, 0};
        int arr2[] = {1, 2, 1};
        int arr3[] = {2, 3, 5, 5};
        int arr4[] = {0};
        int arr5[] = {1, 0};
        int arr6[] = {0, 0, 0};
        System.out.println(equillibriumIndex(arr1));
        System.out.println(equillibriumIndex(arr2));
        System.out.println(equillibriumIndex(arr3));
        System.out.println(equillibriumIndex(arr4));
        System.out.println(equillibriumIndex(arr5));
        System.out.println(equillibriumIndex(arr6));
    }

    //    TODO: Corner cases not covered
    static int bruteForce(int[] arr) {
        int matches = 0;
        if (arr.length <= 2)
            return -1;

        ArrayList<Integer> matchedIndexes = new ArrayList<Integer>();

        for (int i = 1; i < arr.length - 1; i++) {
            int leftSum = arr[0];
            int rightSum = arr[arr.length - 1];

            for (int j = 1; j < i; j++) {
                leftSum += arr[j];
            }

            for (int k = i + 1; k < arr.length - 1; k++) {
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                matchedIndexes.add(i);
                matches++;
            }
        }
        System.out.println(Arrays.toString(matchedIndexes.toArray()));
        return matches;
    }

    static int equillibriumIndex(int arr[]) {
        ArrayList<Integer> matchedIndexes = new ArrayList<Integer>();
        long prefixSum = 0;
        for (int elem : arr) {
            prefixSum += elem;
        }
        long sumTillNow = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum -= arr[i]; // Deriving the Sum of Right Elements
            if (sumTillNow == prefixSum) {
                matchedIndexes.add(i);
            }
            sumTillNow += arr[i];
        }
        System.out.println(Arrays.toString(matchedIndexes.toArray()));
        return matchedIndexes.isEmpty() ? -1 : matchedIndexes.get(0);
    }
}
