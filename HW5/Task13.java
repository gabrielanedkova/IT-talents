
public class Task13 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 11, 21, 31, 41, 51 };
		int[] newArr = concatenteArrays(arr1, arr2);

	}

	static int[] concatenteArrays(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++)
			newArr[i] = arr1[i];
		for (int i = 0; i < arr2.length; i++)
			newArr[arr1.length + i] = arr2[i];

		return newArr;
	}
}
