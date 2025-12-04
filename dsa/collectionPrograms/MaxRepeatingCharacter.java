package dsa.collectionPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxRepeatingCharacter {	
    public static void main(String[] args) {
		String s="mmalayalamm";
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		int maxValue=0; 
		for(Map.Entry<Character,Integer>entry:map.entrySet()) {
			if(entry.getValue()>maxValue) {
			    maxValue=entry.getValue();
			}
		}
		for(Map.Entry<Character,Integer>entry:map.entrySet()) {
			if(entry.getValue()==maxValue) {
			   System.out.println(entry.getKey()+" - "+entry.getValue());
			}
		}
		
	}
}
