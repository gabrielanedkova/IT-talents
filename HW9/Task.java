package lecture14Homework;

public class Task {
	
	private String name;
	private int workingHours;
	
	Task(final String name, final int workingHours){
		if (name != null)
			this.name = name;
		if (workingHours >= 0)
			this.workingHours = workingHours;
	}

	public String getName() {
			return name;
	}

	public void setName(final String name) {
		if (name != null)
			this.name = name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(final int workingHours) {
		if (workingHours >= 0)
			this.workingHours = workingHours;
	}
	
	
}
