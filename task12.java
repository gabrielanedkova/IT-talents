import java.util.Scanner;

public class task12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a day");
		int day = scanner.nextInt();
		System.out.println("Enter a month");
		int month = scanner.nextInt();
		System.out.println("Enter a year");
		int year = scanner.nextInt();
		scanner.close();
		if (year < 1 || month < 1 || month > 31)
			System.out.println("Incorrect input");
		else {
			boolean isLeap = false;
			if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 != 0))
				isLeap = true;
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (day == 31) {
					if (month == 12) {
						year++;
						month = 1;
						day = 1;
					} else {
						month++;
						day = 1;
					}
				} else if (day >= 1 && day < 31)
					day++;
				else {
					System.out.println("Invalid data");
					return;
				}
				System.out.println(day + ", " + month + ", " + year);

			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day == 30) {
					month++;
					day = 1;
				} else if (day >= 1 && day < 30)
					day++;
				else {
					System.out.println("Invalid data");
					return;
				}
				System.out.println(day + ", " + month + ", " + year);
			} else {
				if (!isLeap) {
					if (day < 1 || day > 28) {
						System.out.println("Invalid data");
						return;
					} else if (day == 28) {
						month++;
						day = 1;
					} else
						day++;
				} else {
					if (day < 1 || day > 29) {
						System.out.println("Invalid data");
						return;
					} else if (day == 29) {
						month++;
						day = 1;
					} else
						day++;
				}
				System.out.println(day + ", " + month + ", " + year);
			}

		}

	}

}