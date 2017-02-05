
public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	Student() {
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		if (name != null)
			this.name = name;
		if (subject != null)
			this.subject = subject;
		if (age > 0)
			this.age = age;

	}

	void upYear() {
		if (isDegree) {
			System.out.println("The student " + name + " has already graduated ");
			return;
		}
		yearInCollege++;
		if (yearInCollege == 4)
			isDegree = true;

	}

	double receiveScholarship(double min, double amount) {
		if (grade > min && age < 30)
			money += amount;
		return money;
	}
	
	@Override
	public String toString(){
		return "Name: " + name + ", Subject: " +  subject + ", Grade: " + grade + 
				", Year in college: " + yearInCollege + ", Age: " + age + ", Graduated: " + isDegree
		 + ", Money: " + money;
	}
}
