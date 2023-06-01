package scaler.intermediate;

public class MaxAndMinOfAnArray {

    public static void main(String[] args) {
        int[] arr1 = {10, 50, 40, 80};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1};
        int[] arr4 = {};
        printMaxMin(arr1);
        printMaxMin(arr2);
        printMaxMin(arr3);
        printMaxMin(arr4);
    }

    public static void printMaxMin(int[] arr) {
        if(arr.length ==0){
            System.out.println("Array Size is 0");
            return;
        }
        int min = arr[0];
        int max = arr[0];

        for (int elem : arr) {
            if (elem < min) {
                min = elem;
            }
            if (elem > max) {
                max = elem;
            }
        }

        System.out.println("Max: " + max + " Min: " + min);
    }
}
