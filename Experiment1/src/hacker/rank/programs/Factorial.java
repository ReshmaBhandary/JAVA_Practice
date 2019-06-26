package hacker.rank.programs;

public class Factorial {

	public static void main(String[] args) {
	int result=(factorial(5));
	int res=recursive(5);
	System.out.println(res);

	}

	private static int recursive(int num) {
		if(num==0) {
			return 1;
		}

		return num*recursive(num-1);
	}

	private static int factorial(int num) {
		int sum=1;
		for(int i=1;i<=num;i++) {
			sum=sum*i;
		}


		return sum;
	}

}
