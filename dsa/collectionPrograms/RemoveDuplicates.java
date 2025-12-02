package dsa.collectionPrograms;

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 9, 11, 2, 4, 1, 5, 3 };
        Set<Integer> s = new TreeSet<>(Collections.reverseOrder());
        for (int element : arr) {
            s.add(element);
        }

        System.out.println(s);
    }
}
