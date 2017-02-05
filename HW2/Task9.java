import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		int min = A;
		int max = B;
		int sum = 0;
		if (A > B) {
			min = B;
			max = A;
		}
		for (int i = min; i <= max; i++) {
			if (i % 3 != 0) {
				sum += i * i;
				if (sum > 200)
					break;
				System.out.print(i * i);
			} else
				System.out.print("skip 3");
			System.out.print(", ");

		}
	}

}
