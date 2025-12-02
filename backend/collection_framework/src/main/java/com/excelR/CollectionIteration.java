package com.excelR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CollectionIteration {
    public static void main(String[] args) {
        Collection<Integer> c4=new ArrayList<>(Arrays.asList(10, 11, 12, 13,100, 200, 300, 400, 500));
        System.out.println(c4);//[10, 11, 12, 13, 100, 200, 300, 400, 500]
//    for each loop / enhanced for loop/ advanced for loop
        for(int i:c4){
           System.out.print(i+" , ");
        }
//   void accept(T t)
        Consumer<Integer> consumer=(num)->{
             System.out.println(num);
        };
        c4.forEach(consumer);

        
//        boolean test(T t)
        Predicate<Integer>p=(x)->{
             return x%2!=0;
        };
        c4.removeIf(p);
        System.out.println(c4);




    }
}
