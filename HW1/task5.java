import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		int thirdNumber = scanner.nextInt();
		scanner.close();
		if (firstNumber > secondNumber) {
			if (secondNumber > thirdNumber)
				System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
			else if (firstNumber > thirdNumber)
				System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
			else
				System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
		} else {
			if (firstNumber > thirdNumber)
				System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
			else if (thirdNumber > secondNumber)
				System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
			else
				System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);

		}

	}

}
