
public class Task7 {

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
		for(int row = 0; row < matrix.length; row++){
			if (row % 2 == 0){
				currentRowSum += matrix[row][0] + matrix[row][2] + matrix[row][4];
				System.out.println(matrix[row][0] + ", " + matrix[row][2] + ", " + matrix[row][4] + ", сума от елементите за реда: " + currentRowSum);			
			}
			else{
				currentRowSum += matrix[row][1] + matrix[row][3] + matrix[row][5];
				System.out.println(matrix[row][1] + ", " + matrix[row][3] + ", " + matrix[row][5] + ", сума от елементите за реда: " + currentRowSum);		
			}
			sumOfAll += currentRowSum;
			currentRowSum = 0;
		}
			
		System.out.println("Сума на елементите: " + sumOfAll);
	}

}
