import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете число");
		int num = sc.nextInt();
		sc.close();
		int counter = 0;
		int copy = num;
		while (copy != 0) {
			copy /= 2;
			counter++;
		}
		int[] arr = new int[counter];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num % 2;
			num /= 2;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}