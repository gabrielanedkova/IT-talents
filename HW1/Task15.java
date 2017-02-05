import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer in the interval [0; 24]");
		byte hour = scanner.nextByte();
		scanner.close();
		if (hour > 24 || hour < 0)
			System.out.println("Invalid hour");
		else if (hour > 9 && hour <= 18)
			System.out.println("Good afternoon");
		else if (hour > 4 && hour <= 9)
			System.out.println("Good morning");
		else
			System.out.println("Good evening");

	}

}
