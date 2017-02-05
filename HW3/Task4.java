import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Моля въведете размер по-голям от 0");
			size = sc.nextInt();
		} while (size <= 0);
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr[i] = sc.nextInt();
		}
		boolean isItMirror = true;
		if (arr.length % 2 != 0 && arr.length != 1)
			isItMirror = false;
		else {
			for (int i = 0; i < arr.length / 2; i++) {
				if (arr[i] != arr[arr.length - i - 1]) {
					isItMirror = false;
					break;
				}
			}
		}
		if (isItMirror == true)
			System.out.println("Масивът е огледален");
		else
			System.out.println("Масивът не е огледален");

		sc.close();

	}
}
