import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1 and y1 - possition between 1 and 8");
		byte x1 = scanner.nextByte();
		byte y1 = scanner.nextByte();
		System.out.println("Enter x2 and y2 - possition between 1 and 8");
		byte x2 = scanner.nextByte();
		byte y2 = scanner.nextByte();
		scanner.close();
		if (x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8 && x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8) {
			boolean color1;
			boolean color2;
			if ((x1 % 2 == 0 && y1 % 2 == 0) || (x1 % 2 != 0 && y1 != 0))
				color1 = true;
			else
				color1 = false;
			if ((x2 % 2 == 0 && y2 % 2 == 0) || (x2 % 2 != 0 && y2 % 2 != 0))
				color2 = true;
			else
				color2 = false;
			if (color1 == color2)
				System.out.println("Same color");
			else
				System.out.println("Different colors");

		} else
			System.out.println("Incorrect input");

	}

}
