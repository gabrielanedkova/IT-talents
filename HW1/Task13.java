import java.util.Scanner;

public class task13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in the interval [-100; 100] :");
		byte temperature = scanner.nextByte();
		scanner.close();
		if (temperature > 100 || temperature < -100)
			System.out.println("Invalid data");
		else if (temperature > 25)
			System.out.println("hot");
		else if (temperature <= 25 && temperature >= 15)
			System.out.println("warm");
		else if (temperature < 15 && temperature >= 0)
			System.out.println("cool");
		else if (temperature < 0 && temperature >= -20)
			System.out.println("cold");
		else if (temperature < -20)
			System.out.println("freezing");
		else
			System.out.println("Incorrect input");

	}

}
