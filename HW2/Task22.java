import java.util.Scanner;

public class task22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 999");
		int N = scanner.nextInt();
		scanner.close();
		if (N > 999 || N < 1)
			System.out.println("Incorrect input");
		else {
			int counter = 1;
			while (counter <= 10) {
				if (N % 2 == 0 || N % 3 == 0 || N % 5 == 0) {
					System.out.print(counter + ":" + N + ", ");
					counter++;
				}
				N++;
			}
		}
	}

}
