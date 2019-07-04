package hacker.rank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class URLMaxCount {
	public static void main(String[] args) {
		String[] urls = new String[6];
		urls[0] = "wiki.com";
		urls[2] = "Hacker.com";
		urls[1] = "Hacker.com";
		
		urls[3] = "java.com";
		urls[4] = "Hacker.com";
		urls[5] = "awiki.com";
		
		
		
		String[] arr = solveIt(urls, urls.length);
		System.out.println(Arrays.asList(arr));
	}
	private static String[] solveIt(String[] urls, int length) {
		Webservice webservice = new Webservice();
		return webservice.getPopUlarURL(urls, length);
	}
}

class Webservice {
	String url = null;

	public String[] getPopUlarURL(String[] urls, int length) {

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		for (String s : urls) {
			if (map.containsKey(s)) {
				Integer value = map.get(s);
				value = value + 1;
				map.put(s, value);
			} else {
				map.put(s, 1);
			}
		}
		
Set<Map.Entry<String, Integer>>	set=map.entrySet();
List<Map.Entry<String, Integer>> list=new ArrayList<Map.Entry<String, Integer>>(set);
Collections.sort(list,new MapCompare());
System.out.println(list);
		
		int i=0;
		String[] array=new String[map.size()];
		for(Map.Entry<String, Integer> a:list) {
			System.out.println(a.getKey()+ " "+ a.getValue());
			
		
			array[i]=a.getKey();
					i++;
		}
		return array;
	}
}
class MapCompare implements Comparator<Map.Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return o2.getValue()-o1.getValue();
	}
	
}