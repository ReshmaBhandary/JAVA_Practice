
public class ReferenceArray {
	int i[] = { 0 };
	static int a = 0;
	 String args[] = { "1", "2" };


	public static void main(String[] args) {
		int a = 99;
		System.out.println(a);
		System.out.println();
		System.out.println(args.length);
		
		int i[] = { 1 };
		alter(i);
		System.out.println(i[0]);

	}

	public static void alter(int i[]) {
		int j[] = { 2 };
		i = j;
		System.out.println(i[0]);
	}

}
