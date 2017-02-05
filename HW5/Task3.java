import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		sc.close();

		if (first.equals(second)) {
			System.out.println("The strings are equal");
		} else if (first.length() == second.length()) {
			System.out.println("The two strings have equal lengths");
			System.out.println("Difference in positions:");
			for (int i = 0; i < first.length(); i++) {
				if (first.charAt(i) != second.charAt(i)) {
					System.out.println((i + 1) + " " + first.charAt(i) + "-" + second.charAt(i));
				}
			}
		} else {
			System.out.println("The strings have different lengths");

		}
	}

}
