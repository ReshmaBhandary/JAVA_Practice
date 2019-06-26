package hacker.rank.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindNthValue {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(67);
		list.add(45);
		list.add(12);
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println(i + "th value " + list.get(i));
		int sum = 0;
		for (Integer n : list) {
			sum = sum + n;
		}
		list.remove(i);
		for (Integer n : list) {
			sum = sum - n;
		}
		System.out.println("sum " + sum);
		scan.close();
	}

}
