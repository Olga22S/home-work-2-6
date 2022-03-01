package homework;

import java.util.List;

public class Task2 {

    public static void printEvenNums(List<Integer> nums) {
        nums.stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .distinct()
                .forEach(num -> System.out.print(num + " "));
    }
}
