
public class Rotate {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		// shift(a);
		shift1(a);

	}

	private static void shift1(int[] a) {
		int temp = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = temp;
		display(a);
	}

	private static void shift(int[] a) {
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];
		}
		a[a.length - 1] = temp;
		display(a);
	}

	private static void display(int[] a) {
		for (int aa : a) {
			System.out.println(aa);
		}
	}

}
