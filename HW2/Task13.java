import java.util.Scanner;

public class task13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number between 2 and 27");
		int num = scanner.nextInt();
		scanner.close();
		if (num >= 2 && num <= 27)
		{
			int a;
			int b;
			int c;
			int sum = 0;
			for (int i = 100; i <= 999; i++)
			{
				a = i/100;
				b = i%100;
				b/=10;
				c = i% 10;
				sum = a + b + c;
				if (sum == num)
					System.out.print(i + ", ");
			}
		}
		else System.out.println("Incorrect input");
	}

}
