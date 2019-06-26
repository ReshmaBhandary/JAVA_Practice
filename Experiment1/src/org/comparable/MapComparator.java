package org.comparable;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MapComparator implements Comparator<Map.Entry<Integer	,Integer> >{

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().compareTo(o2.getValue());
	}

	
}
