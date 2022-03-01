package homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task4 {

    public static void printRepeatWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}
