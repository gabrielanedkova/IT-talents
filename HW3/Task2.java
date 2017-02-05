import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Моля въведете размер по-голям от 0");
			size = sc.nextInt();
		} while (size <= 0);
		int[] arr1 = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[2 * arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i] + ", ");
		}
		int j = arr1.length - 1;
		for (int i = arr1.length; i < arr2.length; i++) {
			arr2[i] = arr1[j];
			j--;
			if (i != arr2.length - 1)
				System.out.print(arr2[i] + ", ");
			else
				System.out.print(arr2[i]);

		}
		sc.close();
	}
}