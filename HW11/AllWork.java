
public class AllWork {

	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	AllWork(){
		tasks = new Task[10];
		freePlacesForTasks = 10;
		currentUnassignedTask = -1;
		
	}
	int getNumberOfTasks(){
		return tasks.length;
	}
	void addTask(Task task){
		if (freePlacesForTasks == 0)
			return;
		tasks[currentUnassignedTask + 1] = task;
		currentUnassignedTask++;
		freePlacesForTasks--;
	}
	
	Task getNextTask(){
		if (currentUnassignedTask < 0)
			return null;
		return tasks[currentUnassignedTask];
	}
	
	boolean isAllWorkDone(){
		for (int i = 0; i < tasks.length; i++){
			if(tasks[i] == null)
				continue;
			if (tasks[i].getWorkingHours() != 0)
				return false;
		}
		return true;
	}
	void setHoursLeft(Task currentTask, int hoursLeft) {
		if (freePlacesForTasks == tasks.length)
			return;
		for (int i = 0; i < tasks.length; i++)
			if (tasks[i] == currentTask && tasks[i]!=null)
				tasks[i].setWorkingHours(hoursLeft);
		
	}
	public void decreaseCurrentUnassignedTask() {
		currentUnassignedTask--;
	}
	
}
	