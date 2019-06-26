package org.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class SingleArrayListRemoveDuplicates {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		ArrayList<String> str = new ArrayList<>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("D");
		str.add("E");
		str.add("B");
		str.add("C");
		//removeDuplicates(str);
		removeDuplicatesMp(str,map);
		for(Entry<String, Integer> keyValue :map.entrySet()) {
			if(keyValue.getValue().equals(1)) {
				System.out.println("non repeated value " + keyValue.getKey() +" :" +keyValue.getValue());
			}else {
				System.out.println("repeated value " + keyValue.getKey() +" :" +keyValue.getValue());
			}
		}
	}

	private static void removeDuplicates(ArrayList<String> str) {
		Object[] singleString=str.toArray();
		for(int i=0;i<singleString.length;i++) {
			if(str.indexOf(singleString[i]) != str.lastIndexOf(singleString[i])) {
				str.remove(singleString[i]);
				str.remove(singleString[i]);
			}
			
		}
		System.out.println(str.toString());
		
	
		
	}

	private static void removeDuplicatesMp(ArrayList<String> str, HashMap<String, Integer> map) {
		for (String key : str) {
			if (map.containsKey(key)) {
				Integer value = map.get(key);
				map.put(key, ++value);
			} else {
				map.put(key, 1);
			}
		}
	}

}
