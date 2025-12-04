package dsa.collectionPrograms;

import java.util.*;

public class FrequencyOfWord {
      public static void main(String[] args) {
        String s="I scream you scream we all scream for ice cream";
        Map<String,Integer> map=new LinkedHashMap<>();
        for(String str:s.split(" ")){
           map.put(str,map.getOrDefault(str,0)+1);
        }
        System.out.println(map);
      }
}
