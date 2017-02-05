import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter another integer: ");
		int secondNumber = scanner.nextInt();
		scanner.close();
		int addition = firstNumber + secondNumber;
		int substraction = firstNumber - secondNumber;
		int multiplication = firstNumber * secondNumber;
		int division = firstNumber / secondNumber;
		int module = firstNumber % secondNumber;
		System.out.println("addition: " + addition);
		System.out.println("substraction: " + substraction);
		System.out.println("multiplication: " + multiplication);
		System.out.println("division: " + division);
		System.out.println("module: " + module);

	}
}
