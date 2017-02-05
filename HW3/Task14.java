import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int counter = 0;
		do {
			System.out.println("Моля въведете положителен размер");
			size = sc.nextInt();
		} while (size <= 0);
		double[] arr = new double[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr[i] = sc.nextDouble();
			if (arr[i] >= -2.99 && arr[i] <= 2.99)
				counter++;
		}
		sc.close();
		double[] newArr = new double[counter];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= -2.99 && arr[i] <= 2.99) {
				newArr[j] = arr[i];
				if (j != counter - 1)
					System.out.print(newArr[j] + ", ");
				else
					System.out.print(newArr[j]);
				j++;
			}
		}
	}
}
