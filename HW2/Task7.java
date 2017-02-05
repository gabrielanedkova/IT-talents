import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n");
		int n = scanner.nextInt();
		scanner.close();
		if (n > 0)
			for (int i = 3; i <= n * 3; i += 3) {
				System.out.print(i);
				if (i != n * 3)
					System.out.print(", ");

			}
	}

}
