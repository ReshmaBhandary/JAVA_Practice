package com.java8.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negani");
		names.add("Negani");
		names.add("Aditya");
		names.add("Steve");
		Collections.sort(names, Collections.reverseOrder());
		names.stream().forEach(x->System.out.println(x));
		System.out.println("***************");
		System.out.println(names.stream().filter(str->str.length()>=6).count());
	Set s=	names.stream().filter(x->x.length()>=6).collect(Collectors.toSet());
	s.forEach(x->System.out.println(x));
		
	
	
	 Map<Integer, String> hmap = new HashMap<Integer, String>(); 
     hmap.put(11, "Apple"); 
     hmap.put(22, "Orange"); 
     hmap.put(33, "Kiwi");  
     hmap.put(44, "Banana"); 
   //  hmap.entrySet().stream().filter(map -> map.getKey().intValue() <= 22) .collect(Collectors.toMap(hmap->hmap.getk, valueMapper))
     Map<Integer, String> result = hmap.entrySet() 
             .stream() 
         //    .filter(map -> map.getValue() != "Apple") 
            .filter(map -> map.getKey().intValue() <= 22) 
             .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue())); 
     System.out.println(result);
		
		
	}

}
