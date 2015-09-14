import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {

		Random rand = new Random();
		int count = 20;
		int numbers[] = new int[count];
		for (int i = 0; i < count; i++) {
			numbers[i] = rand.nextInt(100);
		}

		System.out.print("Original Sequence: ");
		System.out.println(Arrays.toString(numbers));

		int low = 0;
		int high = numbers.length - 1;

		quickSort(numbers, low, high);

		System.out.print("Sorted Sequence: ");
		System.out.println(Arrays.toString(numbers));
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;

		if (low >= high)
			return;

		int middle = low + (high - low) / 2;
		int pivot = arr[middle];

		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if (low < j)
			quickSort(arr, low, j);

		if (high > i)
			quickSort(arr, i, high);
	}

}
