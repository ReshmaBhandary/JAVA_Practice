
public class ArmStrongNumber {

	public static void main(String[] args) {
		int givenNumber = 371;
		double ans=armStrong(givenNumber);
		if(ans==givenNumber) {
			System.out.println("yes its a armStrong number "+ans);
		}else {
			System.out.println("NO its not");
		}

	}

	private static double armStrong(int givenNumber) {
		double sum=0;
		while(givenNumber>0) {
			int remainder=givenNumber%10;
			sum=sum+Math.pow(remainder, 3);
			givenNumber=givenNumber/10;
			
		}
		System.out.println(sum);
		return sum;
	}

}
