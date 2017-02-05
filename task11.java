import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a three digit integer");
		short num = scanner.nextShort();
		scanner.close();
		if ((int) Math.log10(num) + 1 == 3) {
			int a, b, c;
			a = num % 10;
			b = (num % 100) / 10;
			c = num / 100;
			if (a != 0 && b != 0 && c != 0)
				if (num % a == 0 && num % b == 0 && num % c == 0)
					System.out.println("The number can be divided by its digits");
				else
					System.out.println("The number cant be divided by its digits");

			else
				System.out.println("Cant divide by zero");

		} else
			System.out.println("Invalid data");
	}

}
