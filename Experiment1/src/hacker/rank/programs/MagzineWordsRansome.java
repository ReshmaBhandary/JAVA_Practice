package hacker.rank.programs;

import java.util.ArrayList;
import java.util.*;

public class MagzineWordsRansome {

	public static void main(String[] args) {
		String[] magzine = { "give", "me", "one", "grand", "today", "night" };
		String[] note = { "give", "one", "today", "me",};
	checkMagazine(magzine, note);

	}

	private static void checkMagazine(String[] magzine, String[] note) {
		List<String> magList = new ArrayList<>();
		boolean flg = false;
		for (String a : magzine) {
			magList.add(a);
		}
		for (String a : note) {
			if (magList.contains(a)) {
				magList.remove(a);
				
			} else {
				flg = true;
				break;
			}
			
		}
		if (flg) {
			System.out.println("NO");

		}else{
			System.out.println("YES");
		}

	}

}
