import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Please enter a positive integer");
			num = sc.nextInt();
		} while (num <= 0);
		sc.close();
		long fact = factorial(num);
		System.out.println(fact);
	}

	static long factorial(int num) {
		int fact = 1;
		for (int i = 2; i <= num; i++)
			fact *= i;
		return fact;
	}
}
