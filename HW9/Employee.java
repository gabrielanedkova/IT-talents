package lecture14Homework;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;

	Employee(final String name) {
		if (name != null)
			this.name = name;
	}

	public String getName() {
		return name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		this.hoursLeft = hoursLeft;
	}

	void work() {
		if (currentTask.getWorkingHours() > hoursLeft) {
			currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursLeft);
			hoursLeft = 0;
		} else {
			hoursLeft -= currentTask.getWorkingHours();
			currentTask.setWorkingHours(0);
		}
		showReport();
	}

	void showReport() {
		System.out.println("Employee name: " + name + "\nTask name: " + currentTask.getName()
				+ "\nWorking hours of employee left: " + hoursLeft + "\nTask hours left: "
				+ currentTask.getWorkingHours());
	}
}
