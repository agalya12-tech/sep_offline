package dsa.collectionPrograms;
import java.util.*;
class FrequencyOfCharacter{
     public static void main(String[] args) {
          String s="malayalam";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
     }
}

