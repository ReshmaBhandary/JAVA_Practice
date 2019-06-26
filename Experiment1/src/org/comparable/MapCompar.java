package org.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapCompar {

	public static void main(String[] args) {
	//	TreeMap<Integer	,Integer> map=new TreeMap<>(new MapComparator());
		TreeMap<Integer	,Integer> map=new TreeMap<>();
		map.put(1, 22);
		map.put(2, 30);
		map.put(3,19);
		for( Map.Entry<Integer	,Integer> a:map.entrySet()) {
			System.out.println(a.getKey() + " and " +a.getValue());
		}
		System.out.println("****************************");
		/*System.out.println("After sorting");
		Map.Entry<Integer	,Integer> sort=(Entry<Integer, Integer>) map.entrySet();
		*/
		List<Map.Entry<Integer	,Integer> > list=new ArrayList<>(map.entrySet());
		Collections.sort(list, new MapComparator());
		for(Map.Entry<Integer	,Integer>  a:list) {
			System.out.println(a.getKey()+ " and "+a.getValue());
			
		}
	}

}
