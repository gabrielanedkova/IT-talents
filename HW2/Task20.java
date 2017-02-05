
public class task20 {

	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if (j + i < 9)
					System.out.print(j + i + 1);
				else
					System.out.print((j + i + 1) % 10);
			}
			System.out.println();
		}
	}
}
