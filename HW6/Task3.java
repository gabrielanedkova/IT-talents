import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		isItPrime(num);
	}
	
	static void isItPrime(int num){
		boolean prime= isPrime(num, num / 2);
		if (prime)
			System.out.println("prime");
		else System.out.println("not prime");

	}
	static boolean isPrime(int num, int divisor){
		if (divisor == 1)
			return true;
		if (num % divisor == 0)
			return false;
		return isPrime(num, divisor - 1);
	}
}
