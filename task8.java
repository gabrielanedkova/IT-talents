import java.util.Scanner;

public class task8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a four digit integer");
		short num = scanner.nextShort();
		scanner.close();
		if (num >= 1000 && num <= 9999) {
			int a, b;
			a = num / 1000 * 10 + num % 10;
			b = num % 1000;
			b /= 10;
			if (a > b)
				System.out.println(num + " bigger (" + a + ">" + b + ")");
			else if (a == b)
				System.out.println(num + " equal (" + a + "=" + b + ")");
			else
				System.out.println(num + " smaller (" + a + "<" + b + ")");
		}
		else System.out.println("Incorrect input");
	}

}