package org.collections;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapInReverse {

	public static void main(String[] args) {
SortedMap<Integer, Integer> map=new TreeMap<>(Collections.reverseOrder());
map.put(1, 123);
map.put(3, 12);
map.put(2, 1);
for(Map.Entry<Integer,Integer> single:map.entrySet()) {
	System.out.println(single.getKey()+" "+single.getValue());
}

	}

}
