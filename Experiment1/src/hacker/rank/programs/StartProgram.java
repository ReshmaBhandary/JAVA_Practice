package hacker.rank.programs;

public class StartProgram {

	public static void main(String[] args) {
		forwardStar1();
		System.out.println("        ");
		upsideDown();
		System.out.println("        ");
		cornerforwardStar();
		forwardStar1();
		backwardStar1();
	}

	private static void cornerforwardStar() {
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(" ");
				if ((j - i) <= 5) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}

	private static void upsideDown() {
		for (int i = 5; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	private static void forwardStar1() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	private static void backwardStar1() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
