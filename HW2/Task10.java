import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("The number isnt prime");
				break;
			}
			if (i == num / 2)
				System.out.println("The number is prime");

		}
	}
}
