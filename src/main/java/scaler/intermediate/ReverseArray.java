package scaler.intermediate;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 50, 40, 80};
        System.out.println(Arrays.toString(reverseArray(arr1)));
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(arr2)));
    }

    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    // Scaler Solution
    public static int[] solve(final int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = A[n - i - 1];
        return ans;
    }
}
