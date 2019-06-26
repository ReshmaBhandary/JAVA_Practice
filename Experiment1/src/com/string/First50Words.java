package com.string;

public class First50Words {

	public static void main(String[] args) {

		String words = "The earliest known human remains in South Asia date to about 30,000 years ago.[26]"
				+ " Nearly contemporaneous human rock art sites have been found in many parts of the Indian subcontinent"
				+ ", including at the Bhimbetka rock shelters in Madhya Pradesh.[27] After 6500 BCE, evidence for domestication of "
				+ "food crops and animals, construction of permanent structures, and storage of agricultural surplus, "
				+ "appeared in Mehrgarh and other sites in what is now Balochistan.[28] These gradually developed into the "
				+ "Indus Valley Civilisation,[29][28] the first urban culture in South Asia,[30] which flourished during 2500–1900 "
				+ "BCE in what is now Pakistan and western India.[31] Centred around cities such as Mohenjo-daro, Harappa, Dholavira,"
				+ " and Kalibangan, and relying on varied forms of subsistence, the civilization engaged robustly in crafts production and wide-ranging trade.[30]";

		String array[] = words.split(" ");
		System.out.println(array.length);

		reshmaLogic(array);
		System.out.println("***********************************************************");
		shrinivasLogic(array);
		System.out.println("***********************************************************");
		String a="\r\n" + 
				"of permanent structures, and storage of agricultural surplus, appeared in Mehrgarh and other sites in what is now Balochistan.[28] These gradually developed into the Indus Valley Civilisation,[29][28] the first urban culture in South Asia,[30] which flourished during 2500–1900 BCE in what is now Pakistan and western India.[31] Centred around cities  \r\n" + 
				"";;
				String [] aa=a.split(" ");
		System.out.println(aa.length);

	}

	private static void shrinivasLogic(String[] array) {
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
			System.out.print(" ");

			if (j!=0 && j % 50 == 0) {
				System.out.println(" ");
			}
		}
	}

	private static void reshmaLogic(String[] array) {
		StringBuilder strBu = new StringBuilder();
		int count = 0;
		for (int j = 0; j < array.length; j++) {
			++count;
			strBu = strBu.append(array[j]).append(" ");
			if (count % 50 == 0) {
				System.out.print(strBu);
				strBu = new StringBuilder();
				System.out.println(" ");
				count = 0;
			}
			if (j == array.length - 1) {
				System.out.print(strBu);
				System.out.println(count);
			}
		}
	}

}
