package dsa.streamPrograms;

import java.util.List;

public class CountStartWithA {
    public static void main(String[] args) {
           List<String> words = List.of("hello", "world", "Alpha", "Animal");
        long count = words.stream()
                .filter(word -> word.startsWith("A"))
                .count();
        System.out.println(count+" words starts with A");

    }
    
}
