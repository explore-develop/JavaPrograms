package scaler.intermediate;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr1 = {10, 50, 40, 80};
        System.out.println(search(arr1, 50));
    }

    public static boolean search(int[] arr, int value){
        boolean found = false;

        for (int element:arr) {
            if(element == value){
                found = true;
                break;
            }
        }

        return found;
    }
}
