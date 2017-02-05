import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = sc.nextLine();
		sc.close();
		int wordsCounter = 1;
		int longestWord = 0;
		int tempLength = 0;
		if (!str.contains(" "))
			System.out.println(1 + " word, " + str.length() + " symbols");
		else {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					if (i == str.length() - 1 || str.charAt(i + 1)== ' ')
						continue;
					if (longestWord < tempLength)
						longestWord = tempLength;
					tempLength = 0;
					wordsCounter++;
				}
				else tempLength++;
			}
			if (longestWord < tempLength)
				longestWord = tempLength;
			System.out.println(wordsCounter + " words, " + "longest contains " + longestWord + " symbols");

		}
	}

}
