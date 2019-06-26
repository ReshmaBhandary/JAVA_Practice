package org.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(123, "1231");
		map.put(124, "1241");
		map.put(125, "1251");
		map.put(126, "1261");
		map.put(127, "1271");
		map.put(123, "1111");
		Set<Integer> set = map.keySet();
		
		for (Integer i : set) {
			
			System.out.println(i +" as key and "+map.get(i)+" as value");
		}
//		System.out.println("***************************************************");
		for (Entry<Integer, String>m:map.entrySet()) {
			
            System.out.println(m.getKey()+" "+m.getValue()); 
         //   map.put(1890, "1890");
        } 

	}
	

}
