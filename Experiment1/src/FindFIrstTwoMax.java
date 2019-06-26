
public class FindFIrstTwoMax {

	public static void main(String[] args) {

		int array[]= {10,55,0,43,80};
		int max1=0;int max2=0, max3=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max1) {
				max3=max2;
				max2=max1;
				
				max1=array[i];
				
			}
			else if(array[i]>max2) {
				max3=max2;
				max2=array[i];
			}
			else if(array[i]>max3) {
				max3=array[i];
				
			}
		}
		System.out.println("max "+max1);
		System.out.println("second max "+max2);
		System.out.println("third max "+max3);
	}

}
