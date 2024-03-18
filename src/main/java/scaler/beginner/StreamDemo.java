package scaler.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,2,2,3,4,3,2);
        System.out.println(numbers.stream().filter((num) -> num % 2 == 0).toList());
    }
}
