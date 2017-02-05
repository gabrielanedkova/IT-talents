import java.util.Scanner;

public class task25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer");
		int N = scanner.nextInt();
		scanner.close();
		int counter = 0;
		int fact = 1;
		do {
			counter++;
			fact *= counter;
		} while (counter != N);

		System.out.println(fact);
	}

}
