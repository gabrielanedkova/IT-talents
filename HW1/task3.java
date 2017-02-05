import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		scanner.close();
		firstNumber += secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber -= secondNumber;
		System.out.println(firstNumber + " " + secondNumber);
	}

}
