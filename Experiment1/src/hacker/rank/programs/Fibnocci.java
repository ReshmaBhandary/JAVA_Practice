package hacker.rank.programs;

public class Fibnocci {

	public static void main(String[] args) {
		System.out.println(fibonacci(6));

	}

	private static int fibonacci(int num) {

		int sum = 0;
		if (num == 0 || num == 1) {
			return num;
		}
		int i = 0;
		int j = 1;
		for (int k = 2; k <=num; k++) {
			sum = i + j;

			i = j;
			j = sum;
		}
		return sum;

	}

}
