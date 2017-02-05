import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		do {
			num1 = sc.nextInt();
		} while (num1 < 2);

		do {
			num2 = sc.nextInt();
		} while (num2 < 2);
		sc.close();
		System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
	}
	static int multiply(int num1, int num2){
		if (num2 == 1)
			return num1;
		return num1 + multiply(num1, num2 -1);
	}
}
