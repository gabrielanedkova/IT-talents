import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1;
		do {
			System.out.println("Моля въведете размер по-голям от 0");
			size1 = sc.nextInt();
		} while (size1 <= 0);
		int[] arr1 = new int[size1];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1) + " на първия масив");
			arr1[i] = sc.nextInt();
		}
		do {
			System.out.println("Моля въведете размер по-голям от 0");
			size1 = sc.nextInt();
		} while (size1 <= 0);
		int[] arr2 = new int[size1];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1) + " на втория масив");
			arr2[i] = sc.nextInt();
		}
		if (arr1.length != arr2.length)
			System.out.println("Не са еднакви, и не са с еднакъв размер");
		else {
			boolean equal = true;
			for (int i = 0; i < arr1.length; i++)
				if (arr1[i] != arr2[i]) {
					System.out.println("Не са еднакви, но са с еднакъв размер");
					equal = false;
					break;
				}
			if (equal)
				System.out.println("Еднакви са и са с еднакъв размер");
		}
		sc.close();
	}

}
