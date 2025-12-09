package dsa.streamPrograms;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertToUpperAndLower {
    public static void main(String[] args) {
        List<String> words = List.of("Hello", "World", "Java", "Streams");
        System.out.println(words);
        Set<String> upperSet=words.stream()
                // .map((e)->e.toUpperCase())
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println("Upper Set:"+upperSet);
        Set<String> lowerSet=words.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toSet());
        System.out.println("Lower Set:"+lowerSet);
    }
}
