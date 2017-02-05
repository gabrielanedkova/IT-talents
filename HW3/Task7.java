import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Моля въведете размер по-голям от 0");
			size = sc.nextInt();
		} while (size <= 0);
		int[] arr1 = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[arr1.length];
		arr2[0] = arr1[0];
		System.out.print(arr2[0] + ", ");
		for (int i = 1; i < arr1.length - 1; i++) {
			if (i == 0 || i == arr1.length - 1) {
				arr2[i] = arr1[i];
			} else
				arr2[i] = arr1[i - 1] + arr1[i + 1];
			System.out.print(arr2[i] + ", ");

		}
		arr2[arr1.length - 1] = arr1[arr1.length - 1];
		System.out.print(arr2[arr1.length - 1]);

		sc.close();
	}

}
