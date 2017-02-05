import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a two digit integer");
		byte a = scanner.nextByte();
		System.out.println("Enter another two digit integer");
		byte b = scanner.nextByte();
		scanner.close();

		if(a >= 10 && a <= 99 && b >= 10 && b <= 99)
		{
			int multiplication = (int)a * b;
			System.out.print(multiplication + ", " );
			multiplication%=10;
			System.out.print(multiplication + " " );
			if (multiplication%2 == 0)
				System.out.println("even");
			else System.out.println("odd");
		}
		else System.out.println("Incorrect input");


	}

}
