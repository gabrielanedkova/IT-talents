import java.util.Scanner;

public class task24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer between 10 and 30000");
		int number = scanner.nextInt();
		scanner.close();
		if (number < 10 || number > 30000)
			System.out.println("Incorrect input");
		else {
			int reversed = 0;
			int digits = (int) Math.log10(number) + 1;
			int mul = (int) Math.pow(10, digits - 1);
			int temp = number;
			int i = 0;
			do {
				int ost = temp % 10;
				temp /= 10;
				reversed = reversed + mul * ost;
				mul = mul / 10;
				i++;
			} while (i < digits);
			if (reversed == number)
				System.out.println("The number is palindrome");
			else
				System.out.println("The number isnt palindrome");
		}
	}

}