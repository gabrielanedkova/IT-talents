import java.util.Scanner;

public class task16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer between 10 and 5555");
		int N = scanner.nextInt();
		System.out.println("Enter another integer between 10 and 5555");
		int M = scanner.nextInt();
		scanner.close();
		if (M < 10 || M > 5555 || N < 10 || N > 5555)
			System.out.println("incorrect input");
		else {
			int min = N;
			int max = M;
			if (N > M) {
				min = M;
				max = N;
			}
			for (int i = max; i >= min; i--)
				if (i % 50 == 0)
					System.out.print(i + ", ");
		}

	}

}
