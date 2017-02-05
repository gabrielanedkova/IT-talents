public abstract class Task {
	
	private final String name;
	private int workingHours;
	
	Task(final String name, final int workingHours){
			this.name = name;
		if (workingHours >= 0)
			this.workingHours = workingHours;
	}

	public String getName() {
			return name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(final int workingHours) {
		if (workingHours >= 0)
			this.workingHours = workingHours;
	}
	
	
}
