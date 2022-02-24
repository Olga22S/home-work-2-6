package homework;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Task4 {

    public static void printRepeatWords(List<String> words) {
        long l = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() > 1)
                .flatMapToLong(s -> LongStream.of(s.getValue()))
                .sum();
        System.out.println(l);
    }
}
