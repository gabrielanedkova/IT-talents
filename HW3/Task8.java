import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Моля въведете размер по-голям от 0");
			size = sc.nextInt();
		} while (size <= 0);
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Моля въведете елемент номер " + (i + 1));
			arr[i] = sc.nextInt();
		}
		int indexCurrent = 0;
		int lengthCurrent = 0;
		int indexGlobal = 0;
		int lengthGlobal = 0;
		for (int i = 0; i < size; i++) {
			if (i != size - 1 && arr[i] == arr[i + 1]) {
				lengthCurrent++;
			} else {
				if (lengthCurrent > lengthGlobal) {
					lengthGlobal = lengthCurrent;
					indexGlobal = indexCurrent;
				}
				lengthCurrent = 0;
				indexCurrent = i + 1;
			}
		}
		for (int i = indexGlobal; i <= indexGlobal + lengthGlobal; i++) {
			if (i != indexGlobal + lengthGlobal)
				System.out.print(arr[i] + ", ");
			else
				System.out.print(arr[i]);

		}

		sc.close();
	}

}
