import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Въведете час");
		short hour = scanner.nextShort();
		System.out.println("Въведете сума");
		double money = scanner.nextDouble();
		System.out.println("Здрав ли съм");
		boolean amIHealthy = scanner.nextBoolean();
		scanner.close();
		if (!amIHealthy) {
			System.out.println("Няма да излизам");
			if (money > 0)
				System.out.println("Ще си купя лекарства");
			else
				System.out.println("Ще стоя вкъщи и ще пия чай");
		} else if (money > 10)
			System.out.println("Ще отида на кино с приятели");
		else
			System.out.println("Ще отида на кафе");
	}

}
