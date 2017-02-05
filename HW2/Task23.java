
public class task23 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				if (i > j)
					j++;
				else {
					System.out.print(i + "*" + j + "; ");
					j++;
				}
			}
			i++;
			System.out.println();
		}

	}

}
