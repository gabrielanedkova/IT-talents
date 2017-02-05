
public class StudentGroup {

	String groupSubject;
	Student[] students;
	int freePlaces;
	
	StudentGroup(){
		students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String subject){
		this();
		if (subject != null)
			groupSubject = subject;
	}
	
	void addStudent(Student s){
		if (freePlaces > 0 && s.subject.equals(groupSubject)){
			students[students.length - freePlaces] = s;
			freePlaces--;
		}
	}
	
	void emptyGroup(){
		students = new Student[5];
		freePlaces = 5;
	}
	
	String theBestStudent(){
		int index = 0;
		for (int i = 1; i < students.length; i++)
			if (students[index].grade < students[i].grade)
				index = i;
		return students[index].name;
	}
	
	void printStudentsInGroup(){
		for (int i = 0; i < students.length; i++){
			System.out.println("Information for student number " +(i + 1));
			System.out.println(students[i].toString());
		}
	}
}
