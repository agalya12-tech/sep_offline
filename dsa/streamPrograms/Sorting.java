package dsa.streamPrograms;

import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 3, 34, 23, 65, 87, 90, 9, 90, 90, 90, 67);
        System.out.println(list);
        // list.sort(Integer::compareTo);
        // Collections.sort(list);
        list.stream()
                // .sorted() // for ascending order
                // .sorted((a,b)->b-a) // for descending order
                .sorted(Collections.reverseOrder()) // for descending order
                .forEach(System.out::println);

    }
}
