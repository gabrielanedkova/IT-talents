import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scanner.nextInt();
		scanner.close();
		int sum = 0;
		if (num >= 1)
			for (int i = 1; i <= num; i++)
				sum += i;
		else
			for (int i = num; i <= 1; i++)
				sum += i;
		System.out.println("The result is " + sum);
	}

}
