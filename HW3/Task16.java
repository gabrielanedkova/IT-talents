import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr[i] = sc.nextDouble();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1)
				System.out.print(arr[i] + ", ");
			else
				System.out.println(arr[i]);
			if (arr[i] < -0.231)
				arr[i] = (i + 1) * (i + 1) + 41.25;
			else
				arr[i] *= (i + 1);
		}
		for (int i = 0; i < arr.length; i++)
			if (i < arr.length - 1)
				System.out.print(arr[i] + ", ");
			else
				System.out.println(arr[i]);
		sc.close();
	}
}
