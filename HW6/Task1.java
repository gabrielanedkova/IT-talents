import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int fib = fibonacci(n);
		System.out.println(fib);
	}
	static int fibonacci(int n){
		if(n == 1 || n == 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);	
		
	}
}
