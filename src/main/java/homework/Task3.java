package homework;

import java.util.HashSet;
import java.util.List;

public class Task3 {

    public static void printUniqueWords(List<String> words) {
        new HashSet<>(words).forEach(str -> System.out.print(str + " "));
    }
}
