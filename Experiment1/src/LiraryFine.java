
public class LiraryFine {

	public static void main(String[] args) {
		int d1 = 28;
		int m1 = 2;
		int y1 = 2015;
		int d2 = 25;
		int m2 = 2;
		int y2 = 2015;
		int fine = calculateFine(d1, m1, y1, d2, m2, y2);
		System.out.println("Fine is " + fine);
	}

	private static int calculateFine(int rtrnd1, int rtrnm1, int rtrny1, int dued2, int duem2, int duey2) {
		int returnValue = 0;
		if (duey2 == rtrny1) {

			if (duem2 <= rtrnm1) {
				if (duem2 == rtrnm1) {
					if (dued2 < rtrnd1) {
						returnValue = (15 * (rtrnd1 - dued2));
					}
				} else {
					returnValue = (500 * (rtrnm1 - duem2));
				}
			}

		

		} else if (duey2 < rtrny1) {
			returnValue = 10000;
		} else {
			returnValue = 0;
		}
		return returnValue;
	}

}
