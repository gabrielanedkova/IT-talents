package lecture14Homework;

public class Demo {

	public static void main(String[] args) {
		
		Task oopHomework = new Task("OOP homework", 3);
		Employee simona = new Employee("Simona Stoqnova");
		simona.setHoursLeft(4);
		simona.setCurrentTask(oopHomework);
		simona.work();
	}

}
