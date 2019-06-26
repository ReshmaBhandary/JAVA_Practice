
public class FindFirstTwoMin {

	public static void main(String[] args) {
int min1=110;
int min2=110;
		int array[]= {10,3,2,9,6};
		for(int n:array) {
		if(n<min1) {
			min2=min1;
			min1=n;
		}
		else if(n<min2) {
		min2=n	;
		}
			
		}
		System.out.println("min1 "+min1 +" and min2 "+min2);
	}

}
