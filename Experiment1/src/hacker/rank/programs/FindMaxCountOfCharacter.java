package hacker.rank.programs;

import java.util.*;

public class FindMaxCountOfCharacter {

	public static void main(String[] args) {
		String a="aazzzr";
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer> ();
		char[] array=a.toCharArray();
		for(char s:array) {
			if(map.containsKey(s)) {
				Integer value=map.get(s);
				value=value+1;
				map.put(s, value);
				
			}else {
				map.put(s, 1);
			}
		}
		
		Set<Character> set=map.keySet();
		char tempKey = 0;
		int tempVale=0;
		for(Character key:set) {
			System.out.println(key+" and "+ map.get(key));
			int values=map.get(key);
			if(values>tempVale) {
				tempVale=values;
				tempKey=key;
			}
		}
		
		System.out.println(tempKey+" "+ tempVale);
		
		
	}
}
