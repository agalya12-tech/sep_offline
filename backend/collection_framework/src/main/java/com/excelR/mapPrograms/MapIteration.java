package com.excelR.mapPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIteration {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=10;i++){
             map.put(i,i+100);
        }
        System.out.println(map);
//         iterate keys
        Set<Integer> keys = map.keySet();
        System.out.println(keys);
//         iterate values
        Collection<Integer> values = map.values();
        System.out.println(values);


//         iterate key-value pair
        Set<Map.Entry<Integer, Integer>> pairs = map.entrySet();
        System.out.println(pairs);
        for(Map.Entry<Integer, Integer> entry:pairs){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        
        map.forEach(
                (key,value)->{
                     System.out.println(key+" - "+value);
                }
        );


    }
}
