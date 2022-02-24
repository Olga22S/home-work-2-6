package homework;

import java.util.List;

public class Task2 {

    public static void printEvenNums(List<Integer> nums) {
        nums.stream()
                .filter(s -> s % 2 == 0)
                .sorted()
                .distinct().forEach(s -> System.out.print(s + " "));
    }
}
