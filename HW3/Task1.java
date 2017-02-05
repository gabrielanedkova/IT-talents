import java.util.Scanner;

public class Task1 {

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
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] < smallest)
				smallest = arr[i];
		}
		if (smallest % 3 != 0)
			System.out.println("В масива няма число кратно на 3");
		else
			System.out.println("Най-малкото число кратно на 3 е " + smallest);
		sc.close();
	}

}
