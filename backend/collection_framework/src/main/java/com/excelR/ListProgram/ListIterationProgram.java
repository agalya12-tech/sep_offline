package com.excelR.ListProgram;

import java.util.*;

public class ListIterationProgram {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(111,112,113,114,115,116,117,118,119));
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ,");
        }
        System.out.println();
        for(int i:list){
            System.out.print(i+" ,");
        }
        System.out.println();
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ,");
        }

        System.out.println();
        ListIterator<Integer> listIt = list.listIterator();
        while(listIt.hasNext()){
            System.out.print(listIt.next()+" ,");
        }
        System.out.println();
        while(listIt.hasPrevious()){
            System.out.print(listIt.previous()+" ,");
        }


        System.out.println();
        list.forEach(
                (e)->{
                 System.out.print(e+" ,");
                });
    }
}
