import java.util.Scanner;

public class task16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a three digit integer");
		short num = scanner.nextShort();
		scanner.close();
		if (num < 100 || num > 999)
			System.out.println("Incorrect input");
		else {
			byte a = (byte) (num / 100);
			byte b = (byte) (((byte) (num / 10)) % 10);
			byte c = (byte) (num % 10);
			if (a == b && b == c)
				System.out.println("The digits are equal");
			else if (a > b && b > c)
				System.out.println("The digits are increasing");
			else if (a < b && b < c)
				System.out.println("The digits are decreasing");
			else
				System.out.println("The digits are in random order");
		}
	}

}
