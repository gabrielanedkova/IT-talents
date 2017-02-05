import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int closer;
		double average = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr[i] = sc.nextInt();
			average += arr[i];
		}
		average /= arr.length;
		closer = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(average - arr[i]) < Math.abs(average - closer))
				closer = arr[i];
		}
		System.out.println("средна стойност " + average + ", най-близка стойност " + closer);
		sc.close();
	}

}
