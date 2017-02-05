import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Моля въведете размер по-голям от 0");
			size = sc.nextInt();
		} while (size <= 0);
		int[] arr1 = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1) + " на първия масив");
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[size];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1) + " на втория масив");
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			if (i < arr1.length - 1)
				System.out.print(arr1[i] + ", ");
			else
				System.out.println(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (i < arr2.length - 1)
				System.out.print(arr2[i] + ", ");
			else
				System.out.println(arr2[i]);
		}
		int[] newArr = new int[arr1.length];
		for (int i = 0; i < newArr.length; i++) {
			if (arr1[i] >= arr2[i])
				newArr[i] = arr1[i];
			else
				newArr[i] = arr2[i];
			if (i < newArr.length - 1)
				System.out.print(newArr[i] + ", ");
			else
				System.out.println(newArr[i]);
		}
		sc.close();
	}
}