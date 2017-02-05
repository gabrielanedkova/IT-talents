import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		scanner.close();
		int temp1 = a1;
		int temp2 = a3;
		a1 = a2;
		a3 = temp1;
		a2 = temp2;

	}

}
