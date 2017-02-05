import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String sentence = sc.nextLine();
		StringBuilder str = new StringBuilder();
		sc.close();
		char ch = Character.toUpperCase(sentence.charAt(0));
		sentence = sentence.toLowerCase();
		str.append(ch);
		for (int i = 1; i < sentence.length(); i++) {
			if (sentence.charAt(i - 1) == ' ') {
				ch = Character.toUpperCase(sentence.charAt(i));
				str.append(ch);
			} else
				str.append(sentence.charAt(i));
		}
		System.out.println(str);

	}

}
