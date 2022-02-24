package homework;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3 {

    public static void printUniqueWords(List<String> words) {
        words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() == 1)
                .forEach(s -> System.out.print(s.getKey() + " "));
    }
}
