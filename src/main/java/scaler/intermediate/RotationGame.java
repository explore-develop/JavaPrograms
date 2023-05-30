package scaler.intermediate;


import java.util.Arrays;

// Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.
public class RotationGame {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(rotateArray(arr1, 2)));
        System.out.println(Arrays.toString(rotateArray(arr2, 5)));
    }

/*
    shift%length to find the index to start with
    Justification: shift can be any number and length is fixed with modulo we need to find the remainder which can point us to the index from where to start
 */

    public static int[] rotateArray(int[] arr, int shift) {
        int[] rotatedArray = new int[arr.length];
        int mod = shift % arr.length;
        if(mod == 0){
            return arr;
        }

        int j = 0;
        for(int i=mod; i < arr.length; i++){
            rotatedArray[j] = arr[i];
            j++;
        }

        for(int i=0; i < mod; i++){
            rotatedArray[j] = arr[i];
            j++;
        }

        return rotatedArray;
    }
}
