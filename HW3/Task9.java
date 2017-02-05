import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Моля въведете размер по-голям от 0");
			size = sc.nextInt();
		} while (size <= 0);
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr[i] = sc.nextInt();
		}
		int swap;
		for (int i = 0; i < size / 2; i++) {
			swap = arr[i];
			arr[i] = arr[size - i - 1];
			arr[size - i - 1] = swap;
		}
		for (int i = 0; i < size - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[size - 1]);

		sc.close();
	}
}
