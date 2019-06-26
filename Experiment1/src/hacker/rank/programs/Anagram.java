package hacker.rank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = new String[] { "tea", "ate", "eat", "apple", "java", "vaja", "cut", "utc" };
		// Output : {"tea", "ate", "eat","java", "vaja", "cut", "utc"}
		List<String> inputList = new ArrayList<String>();
		for (String str : input)
			inputList.add(str);

		Set<String> set = new HashSet<String>();

		int i = 0;
		int j = 0;
		for (; i < inputList.size() - 1; i++) {
			System.out.println(set);
			for (j = i + 1; j < inputList.size(); j++) {
				if (checkAnagram(inputList.get(i), inputList.get(j))) {
					set.add(inputList.get(i));
					set.add(inputList.get(j));
					inputList.remove(j--);
				}
			}
		}
		//removeList(,set);
		System.out.println("*************");
		System.out.println(inputList);
	}
	private static void removeList(List<String> s, Set<String> set) {

		for (String a : set) {
			if (s.contains(a)) {
				s.remove(a);
			}
		}
	}
	private static boolean checkAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		char[] s1Array = str1.toLowerCase().toCharArray();

		char[] s2Array = str2.toLowerCase().toCharArray();

		Arrays.sort(s1Array);

		Arrays.sort(s2Array);

		return Arrays.equals(s1Array, s2Array);

	}

}
