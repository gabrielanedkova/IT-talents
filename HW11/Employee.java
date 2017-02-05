public class Employee {

	private final String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;

	Employee(final String name) {
			this.name = name;
			hoursLeft = 8;
	}

	public String getName() {
		return name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask() {
		if (currentTask == null || currentTask.getWorkingHours() == 0 ){
			this.currentTask = allWork.getNextTask();
			allWork.decreaseCurrentUnassignedTask();
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		this.hoursLeft = hoursLeft;
	}
	

	public static AllWork getAllWork() {
		return allWork;
	}

	public static void setAllWork(AllWork allWork) {
		if (allWork != null)
			Employee.allWork = allWork;
	}

	void work() {
		setCurrentTask();
		if(currentTask == null){
			return;
		}
		int taskHours = currentTask.getWorkingHours();
		if(taskHours <= hoursLeft){
			hoursLeft -= taskHours;
			currentTask.setWorkingHours(0);
			allWork.setHoursLeft(currentTask, 0);
			showReport();
			if(!allWork.isAllWorkDone()){
				currentTask = allWork.getNextTask();
				work();
			}
		}
		else{
			currentTask.setWorkingHours(taskHours - hoursLeft);
			allWork.setHoursLeft(currentTask, taskHours - hoursLeft);
			hoursLeft = 0;
			showReport();
		}
		startWorkingDay();
	}
	
	void startWorkingDay(){
		hoursLeft = 8;
	}

	void showReport() {
		System.out.println("Employee name: " + name + " Task name: " + currentTask.getName()
				+ " Working hours of employee left: " + hoursLeft + " Task hours left: "
				+ currentTask.getWorkingHours());
	}
}
