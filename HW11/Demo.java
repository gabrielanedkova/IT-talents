import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Employee[] employees  = new Employee[4];
		employees[0] = new Employee("Maria");
		employees[1] = new Employee("Ivan");
		employees[2] = new Employee("Aleksandra");
		employees[3] = new Employee("Emil");
		AllWork allWork = new AllWork();
		for (int i = 0; i < allWork.getNumberOfTasks(); i++){
			Random rand = new Random();
			int randomTask = rand.nextInt(3);
			int randomHours = rand.nextInt(20);
			if (randomTask == 0)
				allWork.addTask(new TaskAttendAMeeting(randomHours + 1));
			else if (randomTask == 1)
				allWork.addTask(new TaskBuyACoffee(randomHours + 1));
			else allWork.addTask(new TaskFillPapers(randomHours + 1));
		}
		Employee.setAllWork(allWork);
		int daysCounter = 1;
		while(true){
			System.out.println("Day " + daysCounter);
			for (int i = 0; i < employees.length; i++) {
				if(employees[i] != null){
					employees[i].work();
				}
			}
			daysCounter++;
			if(Employee.getAllWork().isAllWorkDone()){
				break;
			}
		}
		


	}

}
