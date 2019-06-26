
public class ArrayReverse {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int mid = array.length / 2;
		int i = 0;
		int j = array.length - 1;
		while (i != mid) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		for (int a : array) {
			System.out.println(a);
		}

	}

}
