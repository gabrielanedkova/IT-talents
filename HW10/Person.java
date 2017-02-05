
public class Person {
	private String name;
	private int age;
	private boolean isMale;

	Person(final String name, final int age, final boolean isMale) {

		setMale(isMale);
		setName(name);
		setAge(age);
	}

	public void setAge(final int age) {
		if (age > 0)
			this.age = age;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	private void setName(final String name) {
		if (name != null) {
			this.name = name;
		} else {
			if (isMale) {
				this.name = "John Doe";
			}
			this.name = "Jane Doe";
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isMale() {
		return isMale;
	}

	void showPersonInfo() {
		System.out.println("Name: " + name + "\nAge: " + age + "\nIs male: " + isMale);
	}
}