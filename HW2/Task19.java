import java.util.Scanner;

public class task19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 99");
		int number = scanner.nextInt();
		scanner.close();
		if (number < 10 || number > 99)
			System.out.println("Incorrect input");
		else {
			while (number != 1) {
				if (number % 2 == 0)
					number /= 2;
				else
					number = number * 3 + 1;
				System.out.print(number + " ");
			}
		}

	}

}
