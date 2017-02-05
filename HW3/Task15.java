import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Моля въведете размер по-голям от 3");
			size = sc.nextInt();
		} while (size < 3);
		double[] arr = new double[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr[i] = sc.nextDouble();
		}
		double great = -1;
		double greater = -1;
		double theGreatest = -1;
		for (int i = 0; i < arr.length; i++) {
			double temp = Math.abs(arr[i]);
			if (temp > great)
				if (temp > theGreatest) {
					if (theGreatest != -1){
						great = greater;
						greater = theGreatest;
					}
					theGreatest = temp;
				} else if (temp > greater) {
					if (greater != -1)
						great = greater;
					greater = temp;
				} else
					great = temp;

		}
		System.out.println(great + ", " + greater + ", " + theGreatest);
		sc.close();
	}
}