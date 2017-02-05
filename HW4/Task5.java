
public class Task5 {

	public static void main(String[] args) {
		int[][] matrix = { 
							{ 1, 2, 3, 4 }, 
							{ 5, 6, 7, 8 }, 
							{ 9, 10, 11, 12 }, 
							{ 13, 14, 15, 16 } 
						};
		int sumRows = 0;
		int sumCols = 0;
		int temp = 0;
		for (int row = 0; row < 4; row++) {
			temp = 0;
			for (int col = 0; col < 4; col++)
				temp += matrix[row][col];
			if (temp > sumRows || row == 0)
				sumRows = temp;

		}
		for (int col = 0; col < 4; col++) {
			temp = 0;
			for (int row = 0; row < 4; row++)
				temp += matrix[row][col];
			if (temp > sumCols || col == 0)
				sumCols = temp;
		}
		System.out.println("най-голяма сума по редове " + sumRows);
		System.out.println("най-голяма сума по колони " + sumCols);
		
		if (sumRows > sumCols)
			System.out.println("Максималната сума по редове е > от максималната сума по колони");
		else if (sumRows < sumCols)
			System.out.println("Максималната сума по редове е < от максималната сума по колони");
		else System.out.println("Максималната сума по редове е = на максималната сума по колони");
	
	}

}
