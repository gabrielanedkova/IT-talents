import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String names;
		String firstName = "";
		String secondName = "";
		do{
			System.out.println("Please enter two names, separated by comma");
			names = sc.nextLine();
			
		}while(!names.contains(","));
		sc.close();
		for(int i = 0; i < names.length(); i++){
			if (names.charAt(i) == ','){
				firstName = names.substring(0, i);
				secondName = names.substring(i + 1, names.length());
			}
		}
		
		int firstASCII = sumASCII(firstName);
		int secondASCII = sumASCII(secondName);
		
		if (firstASCII > secondASCII)
			System.out.println(firstName);
		else System.out.println(secondName);

	
	}
	static int sumASCII (String name){
		int sum = 0;
		for (int i = 0; i < name.length(); i++){
			if (name.charAt(i) == ' ')
				continue;
			sum += name.charAt(i);
			
		}
		return sum;
	}
}
