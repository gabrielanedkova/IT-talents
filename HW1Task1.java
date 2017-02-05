import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		double firstNumber = scanner.nextDouble();
		System.out.println("Enter second number:");
		double secondNumber = scanner.nextDouble();
		System.out.println("Enter third number:");
		double thirdNumber = scanner.nextDouble();
		scanner.close();
		if (firstNumber > thirdNumber && thirdNumber > secondNumber)
			System.out.println(thirdNumber + " is between " + secondNumber + " and " + firstNumber);
		else if (secondNumber > thirdNumber && thirdNumber > firstNumber)
			System.out.println(thirdNumber + " is between " + firstNumber + " and " + secondNumber);
		else
			System.out.println(thirdNumber + " isnt between " + firstNumber + " and " + secondNumber);
	}

}
