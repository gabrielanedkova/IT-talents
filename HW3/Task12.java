import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr[i] = sc.nextInt();
		}
		int swap;
		swap = arr[0];
		arr[0] = arr[1];
		arr[1] = swap;

		arr[2] += arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] -= arr[3];

		arr[4] *= arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] /= arr[5];

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[arr.length - 1]);
		sc.close();
	}

}
