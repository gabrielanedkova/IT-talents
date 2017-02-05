
public class Student extends Person {

	private double score;

	Student(final String name, final int age, final boolean isMale, final double score) {
		super(name, age, isMale);
		setScore(score);
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 2 && score <= 6)
			this.score = score;
		else score = 2;
	}

	public void showStudentInfo() {
		super.showPersonInfo();
		System.out.println("Score: " + score);
	}

}
