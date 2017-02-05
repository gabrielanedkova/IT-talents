import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n bigger than 0");
		int n = scanner.nextInt();
		scanner.close();
		int num = n - 1;
		if (n >= 1)
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(num);
				}
				num += 2;
				System.out.println();
			}
		else
			System.out.println("Incorrect input");
	}

}