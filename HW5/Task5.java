import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two words");
		String firstWord = sc.next();
		String secondWord = sc.next();
		sc.close();
		if (firstWord.indexOf(secondWord.charAt(0)) != -1){
			int i = 0;
			while(firstWord.charAt(i) != secondWord.charAt(0)){
				System.out.println(firstWord.charAt(i));
				i++;
			}
			i++;
			System.out.println(secondWord);
			while(i < firstWord.length()){
				System.out.println(firstWord.charAt(i));
				i++;
			}
		}
		else System.out.println("The words dont have a common letter");
	}

}
