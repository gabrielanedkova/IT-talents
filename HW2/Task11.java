import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		scanner.close();
		for (int i = 0; i < num; i++) {
			for (int j = 1; j <= 2 * i + 1; j++) {
				if (j == 1) {
					for (int k = 0; k < (2 * num - 2 * i - 2) / 2; k++)
						System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
