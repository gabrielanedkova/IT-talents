import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the second number");
		int secondNumber = scanner.nextInt();
		scanner.close();
		int min = firstNumber;
		int max = secondNumber;
		if (firstNumber > secondNumber){
			min = secondNumber;
			max = firstNumber;	
		}
		for(int i = min; i <= max; i++)
			System.out.print(i + " ");

	}

}
