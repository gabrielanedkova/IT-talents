import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an intiger between 10 and 200");
		int N = scanner.nextInt();
		scanner.close();
		if (N > 200 || N < 10)
			System.out.println("Incorrect input");
		else
			for (int i = N - 1; i >= 14; i--)
				if (i % 7 == 0)
					System.out.println(i);
	}

}
