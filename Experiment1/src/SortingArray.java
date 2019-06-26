
public class SortingArray {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 1, 3, 4 };
		sort(array);
		for (int a : array) {
			System.out.println(a);
		}
		System.out.println("************************************");
		sortDesc(array);
		for (int a : array) {
			System.out.println(a);
		}
	}

	private static void sortDesc(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	private static void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {

				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
					// int temp=array[i];
					// array[i]=array[j];
					// array[j]=temp;
				}

			}
		}
		return;
	}

}
