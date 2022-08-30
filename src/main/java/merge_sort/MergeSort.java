package merge_sort;

public class MergeSort {

	public static void mergeSort(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int left = arr.length / 2;
		int right = arr.length - left;
		
		int[] leftArr = new int[left];
		int[] rightArr = new int[right];

		for (int i = 0; i < left; i++) {
			leftArr[i] = arr[i];
		}

		for (int i = arr.length / 2; i < arr.length; i++) {
			rightArr[i - (arr.length / 2)] = arr[i];
		}

		mergeSort(leftArr);
		mergeSort(rightArr);

		mergeArray(arr, leftArr, rightArr);
	}

	private static void mergeArray(int[] arr, int[] leftArr, int[] rightArr) {
		int countLeft = 0;
		int countRight = 0;
		int count = 0;

		while (countLeft < leftArr.length && countRight < rightArr.length) {
			if (leftArr[countLeft] <= rightArr[countRight]) {
				arr[count++] = leftArr[countLeft++];
			} else {
				arr[count++] = rightArr[countRight++];
			}
		}
		
		while (countLeft < leftArr.length) {
			arr[count++] = leftArr[countLeft++];
		}

		while (countRight < rightArr.length) {
			arr[count++] = rightArr[countRight++];
		}
	}

	public static void main(String[] args) {
		int[] actual = {9,8,7,6,5,4,3,2,1,0};
		mergeSort(actual);
		for (int i = 0; i < actual.length; i++) {
			System.out.println(actual[i]);
		}

	}
}
