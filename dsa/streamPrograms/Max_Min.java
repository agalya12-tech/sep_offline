package dsa.streamPrograms;

import java.util.List;
import java.util.Optional;

public class Max_Min {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 3, 4, 2);
        Optional<Integer> max = list.stream().max((a, b) -> a - b);
        if (max.isPresent()) {
            System.out.println("maximum element is : " + max.get());
        }
        Optional<Integer> min = list.stream().min((a, b) -> a - b);
        if (min.isPresent()) {
            System.out.println("minimum element is : " + min.get());
        }
    }

}
