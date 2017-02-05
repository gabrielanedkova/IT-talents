import java.util.Scanner;

public class Task11and12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Please enter a positive integer");
			size = sc.nextInt();
		} while (size <= 0);
		sc.close();
		int[] arr = createArr(size);
		printArr(arr);
	}

	static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			if (i != arr.length - 1)
				System.out.print(arr[i] + ", ");
			else
				System.out.print(arr[i]);

	}

	static int[] createArr(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++)
			arr[i] = i + 1;
		return arr;
	}
}
