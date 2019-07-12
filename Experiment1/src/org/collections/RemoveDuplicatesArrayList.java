package org.collections;

import java.util.*;

public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("A");
		strList.add("D");

		ArrayList<String> strList2 = new ArrayList<>();
		strList2.add("A");
		strList2.add("B");
		strList2.add("C");
		
		Set<String> set = giveDuplicates(strList, strList2);
		removeDuplicates(set,strList);
		
		
		System.out.println("**********************************");
		ArrayList<String> listString1=new ArrayList<>();
		listString1.add("A");
		listString1.add("A");	listString1.add("B");
		listString1.add("C");
		
		
		ArrayList<String> listString2=new ArrayList<>();
		listString2.add("A");
		listString2.add("B");
		
		
		HashSet<String> sett=new HashSet<>();
		for(String str:listString2){
			if(listString1.contains(str)){
				listString1.remove(str);
			}else{
			sett.add(str);	
			}
		}
		sett.addAll(listString1);
		System.out.println(sett);

	}

	
	


	private static void removeDuplicates(Set<String> set, ArrayList<String> strList) {
		ArrayList<String> dupArrayList=new ArrayList<>(set);
		strList.removeAll(dupArrayList);
		System.out.println("Non Duplicates "+strList.toString());
		
		
		
	}



	private static Set<String> giveDuplicates(ArrayList<String> strList, ArrayList<String> strList2) {
		strList.addAll(strList2);
		Set<String> set = new HashSet<>();
		Set<String> finalSet = new HashSet<>();
		for (String str : strList) {
			if (!set.add(str)) {
				finalSet.add(str);
			}
		}
		System.out.println("Duplicates  "+finalSet.toString());
		return finalSet;
	}

}
