package dsa.streamPrograms;

import java.util.List;

public class PrintEven_Odd {
    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Even Numbers:");
        numbers.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
        System.out.println("Odd Numbers:");
        numbers.stream()
                .filter(n->n%2!=0)
                .forEach(System.out::println);
    }
}
