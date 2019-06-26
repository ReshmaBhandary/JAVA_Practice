package hacker.rank.programs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class FunWithAnagrams {

	public static void main(String[] args) {
		
		/*Integer i=10;
		System.out.println(123/-0.0);
		
		*/
		int i=0;
		add(i);
		System.out.println(i);
		
		
		List<String> s = new ArrayList<>();
		s.add("poke");
		s.add("pkoe");
		s.add("kpeo");
		s.add("Anagrams");
		s.add("Anagrams1");
		s.add("gramsaAn");
		s.add("code");
		s.add("odec");
		s.add("deco");
		s.add("kpeo");

		List<String> ans = funWithAnagrams1(s);
		Collections.sort(ans);
		for (String a : ans) {
			System.out.print(a);
			System.out.print(" ");
		}
		
	}

	private static void add(int i) {
		// TODO Auto-generated method stub

i=i+2;
	}

	private static List<String> funWithAnagrams1(List<String> s) {
		for (int i = 0; i < s.size(); i++) {
			for (int j =  i+1; j < s.size(); j++) {
				boolean flag = isAnagram(s.get(i), s.get(j));
				if (flag) {
					s.remove(s.get(i));
					s.remove(s.get(j-1));
					i=0;
					j=i;
				}
				
			}
		}
		return s;
	}

	private static List<String> funWithAnagrams(List<String> s) {
		Set<String> set=new HashSet<String>();
		
		//CopyOnWriteArrayList<String> obj = new CopyOnWriteArrayList<>(s);
		//Collections.sort(obj);
		//Collections.sort(s);
	for (int i = 0; i < s.size(); i++) {
			for (int j =  i+1; j < s.size(); j++) {
				System.out.println("first and second "+s.get(i)+" "+ s.get(j));
				boolean flag = isAnagram(s.get(i), s.get(j));
				if (flag) {
					set.add(s.get(i));
					set.add(s.get(j));
				
				}
			}
		}
	removeList(s,set);
		return s;
	}

	private static void removeList(List<String> s, Set<String> set) {

		for(String a:set) {
			if(s.contains(a)) {
				s.remove(a);
			}
		}
	}

	private static boolean isAnagram(String string, String string2) {
		if(string.length()==string2.length()) {
			
		
		char[] a = string.toCharArray();
		char[] b = string2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
		}
		return false;
		}

}
