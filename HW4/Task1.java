
public class Task1 {

	public static void main(String[] args) {
		int[][] matrix = { 
							{ 48, 72, 13, 14, 15 }, 
							{ 21, 22, 53, 24, 75 }, 
							{ 31, 57, 33, 34, 35 },
							{ 41, 95, 43, 44, 45 }, 
							{ 59, 52, 53, 54, 55 }, 
							{ 61, 69, 63, 64, 65 } 
						};
		int min = matrix[0][0];
		int max = matrix[0][0];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] > max)
					max = matrix[row][col];
				if (matrix[row][col] < min)
					min = matrix[row][col];
				if (col != matrix[row].length - 1)
					System.out.print(matrix[row][col] + ", ");
				else
					System.out.print(matrix[row][col]);

			}
			System.out.println();
		}
		System.out.println("най-малко " + min);
		System.out.println("най-голямо " + max);

	}

}
