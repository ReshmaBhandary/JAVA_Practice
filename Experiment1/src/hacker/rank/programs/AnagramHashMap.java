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

public class AnagramHashMap {

	public static void main(String[] args) {

		List<String> s = new ArrayList<>();
		s.add("poke");
		s.add("pkoe");
		s.add("kpeo");
		s.add("Anagrams");
		s.add("Anagrams1");
		s.add("gramsaAn");

		// map(s);

		List<String> ans = funWithAnagrams(s);
		for (String a : ans) {
			System.out.println(a);
		}
	}

	private static List<String> funWithAnagrams(List<String> s) {
		Set<String> set = new HashSet<String>();

		// CopyOnWriteArrayList<String> obj = new CopyOnWriteArrayList<>(s);
		// Collections.sort(obj);
		// Collections.sort(s);
		for (int i = 0; i < s.size(); i++) {
			for (int j = i + 1; j < s.size(); j++) {
				// System.out.println("first and second "+s.get(i)+" "+ s.get(j));
				boolean flag = isAnagram(s.get(i), s.get(j));
				if (flag) {
					set.add(s.get(i));
					set.add(s.get(j));

				}
			}
		}
		removeList(s, set);
		return s;
	}

	private static void removeList(List<String> s, Set<String> set) {

		for (String a : set) {
			if (s.contains(a)) {
				s.remove(a);
			}
		}
	}

	private static boolean isAnagram(String string, String string2) {
		if (string.length() == string2.length()) {

			char[] a = string.toCharArray();
			char[] b = string2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			return Arrays.equals(a, b);
		}
		return false;
	}

	private static void map(List<String> s) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String a : s) {
			if (map.containsKey(s)) {
				int value = map.get(a);
				map.put(a, value++);
			} else {
				map.put(a, 1);
			}
		}
		System.out.println("****************************");
		Set<String> av = map.keySet();
		for (String b : av)
			System.out.println("key " + b + " and value " + map.get(b));

		System.out.println("****************************");
	}

}
