import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String first;
		String second;
		do {
			System.out.println("Please enter two strings, no longer than 40 symbols, which contain only letters");
			first = sc.next();
			second = sc.next();

		} while (first.length() > 40 || second.length() > 40 || !isLetter(first) || !isLetter(second));

		sc.close();
		printStrings(first, second);

	}

	static boolean isLetter(String name) {
		return name.matches("[a-zA-Z]+");
	}

	static void printStrings(String first, String second) {
		System.out.print(first.toUpperCase() + " " + first.toLowerCase());
		System.out.print(" " + second.toUpperCase() + " " + second.toLowerCase());
	}
}
