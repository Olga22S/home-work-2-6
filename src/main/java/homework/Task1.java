package homework;

import java.util.List;

public class Task1 {

    public static void printOddNums(List<Integer> nums) {
        nums.stream()
                .filter(s -> s % 2 != 0)
                .forEach(s -> System.out.print(s + " "));
    }
}
