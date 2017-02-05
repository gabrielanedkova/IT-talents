import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String first;
		String second;
		do {
			System.out.println("Please enter two strings, each between 10 and 20 symbols");
			first = sc.next();
			second = sc.next();

		} while (first.length() < 10 || first.length() > 20 || second.length() < 10 || second.length() > 20);

		sc.close();
		int length = first.length();
		if (length > second.length()){
			System.out.print(length + " ");
			System.out.println(second.substring(0, 5) + first.substring(5, first.length()));
		}
		else{
			System.out.print(second.length() + " ");
			System.out.println(first.substring(0, 5) + second.substring(5, second.length()));

		}
	
	}

}
