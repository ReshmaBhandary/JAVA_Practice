package org.collections;

import java.util.ArrayList;
import java.util.*;

public class HashMapEmployee {

	public static void main(String[] args) {
		EmployeeHashMap emp1 = new EmployeeHashMap(1, "Ashish", 2);
		EmployeeHashMap emp2 = new EmployeeHashMap(2, "Bhaskar", 1);
		EmployeeHashMap emp3 = new EmployeeHashMap(3, "Reshma", 4);
		EmployeeHashMap emp4 = new EmployeeHashMap(1, "Ashish1", 2);
		ArrayList<EmployeeHashMap> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

		HashMap<Integer, String> map = new HashMap();
		for (EmployeeHashMap single : empList) {
			Integer key = single.getEmpID();
			if (map.containsKey(key)) {
				map.put(key, single.getEmpName());
			} else {
				map.put(key, single.getEmpName());

			}
		}
		
		Set<Integer> set=map.keySet();
		for(Integer key:set) {
System.out.println("Employee id " +key+ " employee name " +map.get(key));
		}

	}

}
