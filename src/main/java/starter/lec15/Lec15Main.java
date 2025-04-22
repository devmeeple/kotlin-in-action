package starter.lec15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lec15Main {

    public static void main(String[] args) {
        // Array
        int[] array = {100, 200};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s %s\n", i, array[i]);
        }

        // List
        final List<Integer> numbers = Arrays.asList(100, 200);
        System.out.println(numbers.get(0));
        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%s %s", i, numbers.get(i));
        }

        // Map
        Map<Integer, String> oldMap = new HashMap<>();
        oldMap.put(1, "MONDAY");
        oldMap.put(2, "TUESDAY");

        Map.of(1, "MONDAY", 2, "TUESDAY");
    }
}
