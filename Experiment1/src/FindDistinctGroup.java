import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDistinctGroup {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(1);
		list.add(2);
		int sum = 4;
		int count = getGroupCount(list, sum);
		System.out.println(count);
	}

	private static int getGroupCount(List<Integer> list, int sum) {
		Set<String> set = new HashSet<>();
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int sums = list.get(i) + list.get(j);
				if (sum == sums) {
					String a = "".concat(String.valueOf(list.get(i))).concat("-").concat(String.valueOf(list.get(j)));
					System.out.println(a);
					set.add(a);
				}
			}
		}

		return set.size();
	}

}
