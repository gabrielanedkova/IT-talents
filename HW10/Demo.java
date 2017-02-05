
public class Demo {

	public static void main(String[] args) {

		Person[] people = new Person[10];
		people[0] = new Person("Ivan", 12, true);
		people[1] = new Person("Victoria", 34, false);
		people[2] = new Student("Ines", 9, false, 5.23);
		people[3] = new Student("Simeon", 18, true, 4.69);
		people[4] = new Employee("Aleksandra", 46, false, 23);
		people[5] = new Employee("Gergana", 39, false, 38.50);

		for (int i = 0; i < people.length; i++) {
			if (people[i] == null)
				continue;
			System.out.println("Info about person number " + (i + 1));
			if (people[i] instanceof Student) {
				((Student) people[i]).showStudentInfo();
			} else if (people[i] instanceof Employee)
				((Employee) people[i]).showEmployeeInfo();
			else if (people[i] instanceof Person) {
				people[i].showPersonInfo();
			}
		}

		for (int i = 0; i < people.length; i++) {
			if (people[i] == null)
				continue;
			if (people[i] instanceof Employee) {
				System.out.print(people[i].getName() + " will receive ");
				System.out.print(((Employee) people[i]).calculateOvertime(2));
				System.out.println(" for two hours overtime.");
			}
		}

	}

}
