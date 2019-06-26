package hacker.rank.programs;

import java.util.*;


public class FindPairNearestIth {

	public static void main(String[] args) {
		int array[] = {6,2,3,5,4,1,7,8,9,0};
		int sum = 10;
		HashMap<Integer, String> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int ans = array[i] + array[j];
				if (sum == ans) {
					String combi = String.valueOf(array[i]).concat(",").concat(String.valueOf(array[j]));
					int firstIndex = findIndex(array[i], array);
					int secondIndex = findIndex(array[j], array);
					int key = Math.abs(firstIndex - secondIndex);
					map.put(key, combi);

				}
			}

		}

		
		Set<Integer> set = map.keySet();
		ArrayList<Integer> keys = new ArrayList<>(set);
		Collections.sort(keys);
		Integer index = keys.get(0);
		System.out.println(index + " as index and " + map.get(index) + "  as value");

	}

	

	private static int findIndex(int aa, int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == aa) {
				return i;
			}

		}
		return 100;

	}

}
