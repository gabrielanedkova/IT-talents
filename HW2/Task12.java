
public class task12 {

	public static void main(String[] args) {

		for (int i = 102; i <= 987; i++) {
			int a = i % 10;
			int b = i % 100;
			b /= 10;
			int c = i / 100;
			if (a != b && a != c && b != c)
				System.out.println(i);
		}

	}

}
