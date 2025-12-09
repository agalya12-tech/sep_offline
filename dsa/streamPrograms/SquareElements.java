package dsa.streamPrograms;

import java.util.List;

public class SquareElements {
      public static void main(String[] args) {
        List<Integer> list = List.of(10, 3, 4, 2 );

       list.stream().map(x->x*x).forEach(System.out::println);

    }
}
