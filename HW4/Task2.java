import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Моля въведете размер на матрицата");
			size = sc.nextInt();
		} while (size < 0);
		int[][] matrix = new int[size][size];
		for (int row = 0; row < size; row++)
			for (int col = 0; col < size; col++) {
				System.out.println("Моля въведете елемент от ред " + row + " и колона " + col);
				matrix[row][col] = sc.nextInt();
			}
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (row == col) {
					if (col != size - 1)
						System.out.print(matrix[row][col] + ", ");
					else
						System.out.println(matrix[row][col]);

				}

			}
		}
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (row + col == size - 1) {
					if (col != 0)
						System.out.print(matrix[row][col] + ", ");
					else
						System.out.println(matrix[row][col]);

				}
			}

		}
		sc.close();
	}
}
