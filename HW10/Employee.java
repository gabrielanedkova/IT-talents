
public class Employee extends Person {

	private double daySalary;

	Employee(final String name, final int age, final boolean isMale, final double daySalary) {
		super(name, age, isMale);
		if (daySalary > 0)
			this.daySalary = daySalary;

	}

	double calculateOvertime(double hours) {
		if (getAge() < 18)
			return 0;
		return (daySalary / 8) * 1.5 * hours; 

	}

	void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Day salary: " + daySalary);
	}
}
