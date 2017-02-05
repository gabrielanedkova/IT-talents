import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = sc.nextLine();
		sc.close();
		
			String firstPart = str.substring(0, (str.length() + 1)/ 2);
			StringBuilder secondPart = new StringBuilder();
			for (int i = str.length() - 1; i >= str.length() / 2; i--) {

				secondPart.append(str.charAt(i));
			}
			if (firstPart.equals(secondPart.toString()))
				System.out.println("yes");
			else
				System.out.println("no");
	}
}
