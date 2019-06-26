package hacker.rank.programs;

import java.util.*;
import java.util.Scanner;

public class LeaderShipClimbBoard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rankSize = scan.nextInt();
		int[] rank = new int[rankSize];
		for (int i = 0; i < rankSize; i++) {
			rank[i] = scan.nextInt();
		}

		System.out.println("*******************");
		int alliceGames = scan.nextInt();
		int[] alliceGamesArray = new int[alliceGames];
		for (int i = 0; i < alliceGames; i++) {
			alliceGamesArray[i] = scan.nextInt();
		}

		scan.close();
		int finalAlliceRank[] = climbingLeaderboard(rank, alliceGamesArray);

	}

	private static int[] climbingLeaderboard(int[] rank, int[] alliceGamesArray) {
		sortDesc(rank);
		TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
		int count = 1;
		for (int key : rank) {
			if (!map.containsKey(key)) {
				map.put(key, count);
				count++;
			}
		}

		Set<Integer> set = map.keySet();
		for (Integer i : set) {
			System.out.println("key as " + i + " and value as  " + map.get(i));
		}
		return null;
	}

	private static void sortDesc(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
