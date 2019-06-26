
public class Palindrom {

	public static void main(String[] args) {

		int number=13;
		int sum=palindrom(number);
		System.out.println(sum);
	}



	private static int palindrom(int number) {
		int sum = 0;
		
		while (number > 0) {
			int ans = number % 10;
			sum = sum * 10 + ans;
			number = number / 10;

		}
		return sum;
	}

}
