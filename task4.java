import java.util.Scanner;

public class task4 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		scanner.close();
		if (firstNumber > secondNumber)
			System.out.println(secondNumber + " " + firstNumber);
		else System.out.println(firstNumber + " " + secondNumber);

	}
}
