package hacker.rank.programs;

public class NewStartTest {

	public static void main(String[] args) {

		upsideDown();
	}

	private static void upsideDown() {
		for (int i = 5; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
