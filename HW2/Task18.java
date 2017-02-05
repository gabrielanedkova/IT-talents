import java.util.Scanner;

public class task18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 9");
		int num1 = scanner.nextInt();
		System.out.println("Enter another integer between 1 and 9");
		int num2 = scanner.nextInt();
		scanner.close();
		if (num1 > 9 || num1 < 1 || num2 > 9 || num2 < 1)
			System.out.println("Incorrect input");
		else {
			for (int i = 1; i <= num1; i++)
				for (int j = 1; j <= num2; j++)
					System.out.println(i + " * " + j + " = " + i * j);
		}

	}

}
