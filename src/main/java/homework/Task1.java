package homework;

import java.util.List;

public class Task1 {

    public static void printOddNums(List<Integer> nums) {
        nums.stream()
                .filter(num -> num % 2 != 0)
                .forEach(num -> System.out.print(num + " "));
    }
}
