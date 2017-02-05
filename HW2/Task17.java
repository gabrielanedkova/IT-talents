import java.util.Scanner;

public class task17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer between 3 and 20");
		int number = scanner.nextInt();
		System.out.println("Enter a sign");
		char sign = scanner.next().charAt(0);
		scanner.close();
		if (number < 3 || number > 20)
			System.out.println("Incorrec input");
		else {
			for (int i = 0; i < number; i++) {
				for (int j = 0; j < number; j++) {
					if (i == 0 || i == number - 1 || j == 0 || j == number - 1)
						System.out.print("*");
					else
						System.out.print(sign);

				}
				System.out.println();

			}
		}
	}

}
