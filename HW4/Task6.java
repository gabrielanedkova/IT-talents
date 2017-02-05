
public class Task6 {

	public static void main(String[] args) {
		int[][] matrix = { 
							{ 11, 12, 13, 14, 15, 16 },
							{ 21, 22, 23, 24, 25, 26 }, 
							{ 31, 32, 33, 34, 35, 36 },
							{ 41, 42, 43, 44, 45, 46 }, 
							{ 51, 52, 53, 54, 55, 56 }, 
							{ 61, 62, 63, 64, 65, 66 } 
						};
		int sumOfAll = 0;
		int currentRowSum = 0;
		for(int row = 1; row < matrix.length; row+=2){
			for(int col = 0; col < matrix[row].length; col++){
				currentRowSum += matrix[row][col];
				if (col != matrix[row].length - 1)
					System.out.print(matrix[row][col] + ", ");
				else System.out.print(matrix[row][col]);
			}
			System.out.println(" сума " + currentRowSum);
			sumOfAll += currentRowSum;
			currentRowSum = 0;
		}
		
		System.out.println("Сума на елементите " + sumOfAll);			
	}

}
