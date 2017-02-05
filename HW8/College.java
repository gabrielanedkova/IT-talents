
public class College {

	public static void main(String[] args) {
		Student ivan = new Student("Ivan Perov", "Sociology", 20);
		Student georgi = new Student("Georgi Georgiev", "Sociology", 30);
		Student martin = new Student("Martin Perov", "Sociology", 24);
		Student maria = new Student("Maria Ivanova", "Sociology", 19);
		Student nikol = new Student("Nikol Borisova", "Sociology", 21);
		ivan.upYear();
		ivan.grade = 5.93;
		ivan.receiveScholarship(5.50, 124);
		maria.upYear();
		StudentGroup gr1 = new StudentGroup("Sociology");
		gr1.addStudent(nikol);
		gr1.addStudent(maria);
		gr1.addStudent(ivan);
		gr1.addStudent(martin);
		gr1.addStudent(georgi);
		System.out.println(gr1.theBestStudent());
		gr1.printStudentsInGroup();
			
	}

}
