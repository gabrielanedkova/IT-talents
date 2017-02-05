import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		do {
			n = sc.nextInt();
		} while (n < 2);
		sc.close();
		int reversed = reverse(n, (int)Math.pow(10, (int)Math.log10(n)));
		System.out.println(reversed);
		if (reversed == n)
			System.out.println("Is a palindrome");
		else System.out.println("Isnt palindrome");
	}
	static int reverse(int n, int pow){
		if(n == 0)
			return 0;
		int num = n%10;
		return pow*num + reverse(n / 10, pow /10);
	}
}
