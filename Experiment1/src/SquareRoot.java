import java.util.ArrayList;
import java.util.HashMap;

public class SquareRoot {

	public static void main(String[] args) {
		
		
		HashMap map=new HashMap<>();
		map.put("", 10);
		map.put("",20);
		System.out.println(map);
		int[] arrays=new int[11];
		int j=0;
		int temp=0;
		for(int i=20;i<=30;i++) {
			arrays[j]=i*i-(temp);
			System.out.println(i +"* " + i +" = "+ i*i);
			temp=i*i;
			
			j++;
		}
		System.out.println("The difference amount between the square roots are below ");
		for(int i=1;i<arrays.length-1;i++) {
			
			System.out.println(arrays[i]);
		}
	}

}
