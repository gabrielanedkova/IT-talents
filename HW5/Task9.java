import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		do {
			System.out.println("Please enter a string containing only letters, numbers or minus sign");
			str = sc.next();
		} while (!str.matches("[a-zA-B0-9-]+"));
		sc.close();
		long sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				StringBuilder digits = new StringBuilder();
				int num = 1;
				if (i != 0 && str.charAt(i - 1) == '-')
					num *= -1;
				while (i < str.length() && str.charAt(i) >= 48 && str.charAt(i) <= 57) {
					digits.append(str.charAt(i));
					i++;
				}
				num *= Integer.parseInt(digits.toString());
				sum += num;
			}
		}
		System.out.println(sum);

	}

}
