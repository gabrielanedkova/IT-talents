import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		System.out.println("Please enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		StringBuilder newStr = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			ch += 5;
			newStr.append(ch);
		}
		System.out.println(newStr);
	}

}
