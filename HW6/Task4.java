import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		if (start > end){
			start+=end;
			end = start-end;
			start-=end;
		}
		triangle(start, end);
		
	}

	static void triangle(int start, int end){
		if (end == start - 1)
			return;
		triangle(start, end - 1);
		for(int i = start; i <= end; i++)
			System.out.print(i);
		System.out.println();
	}
}
