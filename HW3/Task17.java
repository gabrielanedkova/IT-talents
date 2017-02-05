import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Моля въведете размер по-голям от 0");
			size = sc.nextInt();
		} while (size <= 0);
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr[i] = sc.nextInt();
		}
		boolean zigZag = true;
		for(int i = 1; i < arr.length; i+=2)
			if (arr[i] < arr[i - 1] || (i != arr.length - 1 && arr[i] < arr[i + 1]) ){
				zigZag = false;
				break;
			}
		if (zigZag)
			System.out.println("Изпълнява изискванията за зигзагообразна нагоре редица");
		else System.out.println("Не изпълнява изискванията за зигзагообразна нагоре редица");
		
		sc.close();
	}
}
