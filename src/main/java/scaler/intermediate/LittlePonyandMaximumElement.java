package scaler.intermediate;

import org.apache.commons.lang3.ArrayUtils;
import scaler.sorting.SelectionSort;

import java.util.Arrays;

/*
https://www.scaler.com/academy/mentee-dashboard/class/19139/homework/problems/9992?navref=cl_tt_lst_nm
Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.

He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible, then return -1.

Example Input
Input 1:

 A = [2, 4, 3, 1, 5]
 B = 3
Input 2:

 A = [1, 4, 2]
 B = 3


Example Output
Output 1:

 2
Output 2:

 -1


Example Explanation
Explanation 1:

 We need to remove 4 and 5 to make 3 the biggest element.
Explanation 2:

 As 3 doesn't exist in the array, the answer is -1.


 */
public class LittlePonyandMaximumElement {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3, 1, 5};
        System.out.println(findMinimumOperations(arr1, 3));
        int[] arr2 = {1, 4, 2};
        System.out.println(findMinimumOperations(arr2, 3));
    }


    public static int findMinimumOperations(int[] arr, int maxElement) {
        int minimumOperations = -1;
        SelectionSort.sort(arr);
        int lastindex = ArrayUtils.lastIndexOf(arr, maxElement);
        if (lastindex == -1) {
            return minimumOperations;
        } else {
            int count = arr.length - (lastindex + 1);
            return count == 0 ? -1 : count;
        }
    }


}
