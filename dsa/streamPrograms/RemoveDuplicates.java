package dsa.streamPrograms;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 3, 34, 23, 65, 87, 90, 9, 90, 90, 90, 67);
        List<Integer> output = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(output);
    }
}
