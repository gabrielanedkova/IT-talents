import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer");
		int N = scanner.nextInt();
		scanner.close();
		int sum = 0;
		int i = 0;
		do {
			sum += i;
			i++;
		} while (i <= N);
		System.out.println(sum);
	}

}
