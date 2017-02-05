import java.util.Scanner;

public class task21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 52");
		int N = scanner.nextInt();
		scanner.close();
		if (N > 51 || N < 1)
			System.out.println("Incorrect input");
		else {
			for (int i = N; i <= 52; i++) {
				if (i >= 1 && i <= 4)
					System.out.print("2 ");
				else if (i >= 5 && i <= 8)
					System.out.print("3 ");
				else if (i >= 9 && i <= 12)
					System.out.print("4 ");

				else if (i >= 13 && i <= 16)
					System.out.print("5 ");

				else if (i >= 17 && i <= 20)
					System.out.print("6 ");

				else if (i >= 21 && i <= 24)
					System.out.print("7 ");

				else if (i >= 25 && i <= 28)
					System.out.print("8 ");

				else if (i >= 29 && i <= 32)
					System.out.print("9 ");

				else if (i >= 33 && i <= 36)
					System.out.print("10 ");

				else if (i >= 37 && i <= 40)
					System.out.print("Jack ");

				else if (i >= 41 && i <= 44)
					System.out.print("Queen ");

				else if (i >= 45 && i <= 48)
					System.out.print("King ");
				else
					System.out.print("Ace ");
				if ((i - 1) % 4 == 0)
					System.out.print("of spades, ");
				else if ((i - 2) % 4 == 0)
					System.out.print("of diamonds, ");
				else if ((i - 3) % 4 == 0)
					System.out.print("of hearts, ");
				else if ((i - 4) % 4 == 0)
					System.out.print("of clubs, ");
			}

		}

	}

}