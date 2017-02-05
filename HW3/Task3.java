import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете число");
		int num = sc.nextInt();
		sc.close();
		int[] arr = new int[10];
		arr[0] = num;
		arr[1] = num;
		System.out.print(arr[0] + ", " + arr[1] + ", ");
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ", ");

		}

	}
}
