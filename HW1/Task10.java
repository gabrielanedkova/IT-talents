import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer between 10 and 9999");
		int num = scanner.nextInt();
		scanner.close();
		if (num >= 10 && num <= 9999) {
			int temp = num / 5;
			System.out.println(temp + " x 2L");
			System.out.println(temp + " x 3L");
			System.out.println("extra " + (num - temp * 5 ) + " liter bucket");
		} else
			System.out.println("Incorrect input");
	}
}
