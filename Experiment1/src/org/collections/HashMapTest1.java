package org.collections;

import java.util.*;

public class HashMapTest1 {

	public static void main(String[] args) {
		System.out.println(1 > 2 ? "a is greater" : "b is greater");
		Set set=new HashSet();
		set.add(null);
		set.add(1);
		set.add(null);
		set.forEach(System.out::println);
		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		List<Integer> list = Arrays.asList(1, 2, 3, 1, 4);
		
		for (Integer key : list) {
			if (map.containsKey(key)) {
				ArrayList<String> ans=map.get(key);
				ans.add("Sushma");
				map.put(key, ans);

			} else {
				ArrayList<String> arr=new ArrayList<>();
				arr.add("Reshma");
				map.put(key, arr);

			}
		}
		for (Map.Entry m:map.entrySet()) {
			
			
			ArrayList<String> arrStr=(ArrayList<String>)m.getValue();
			if(arrStr.size()==2) {
				System.out.println(m.getKey()+" ,"+ m.getValue());
			}
			
		}

	}

}
