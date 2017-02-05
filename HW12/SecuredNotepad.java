import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	private String password;
	final Scanner sc = new Scanner(System.in);


	SecuredNotepad(int numberOfPages, String password) throws Exception{
		super(numberOfPages);
		if (!validatePassword(password))
		 throw new Exception("Weak password!");
		else this.password = password;
	}

	boolean validatePassword(String password) {
		return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{5,}$");
	}

	boolean logIn() {
		System.out.println("Enter your password: ");
		String pass = sc.next();
		if (!this.password.equals(pass)) {
			System.out.println("The password you’ve entered is incorrect.");
			return false;
		}
		return true;
	}

	@Override
	public void addText(String text, int pageNumber) {
		if (!logIn())
			return;
		super.addText(text, pageNumber);
	}

	@Override
	public void addHeader(String header, int pageNumber) {
		if(!logIn())
			return;
		super.addHeader(header, pageNumber);
	}

	@Override
	public void deleteHeader(int pageNumber) {
		if(!logIn())
			return;
		super.deleteHeader(pageNumber);
	}

	@Override
	public void deleteAndAddText(String text, int pageNumber) {
		if(!logIn())
			return;
		super.deleteAndAddText(text, pageNumber);

	}

	@Override
	public void deleteText(int pageNumber) {
		if(!logIn())
			return;
		super.deleteText(pageNumber);

	}

	@Override
	public boolean searchWord(String word) {
		if(!logIn())
			return false;
		return super.searchWord(word);
	}

	@Override
	public void printAllPages() {
		if(!logIn())
			return;
		super.printAllPages();

	}

	@Override
	public void printAllPagesWithDigits() {
		if(!logIn())
			return;
		super.printAllPagesWithDigits();
	}
	
	public void changePassword(){
		if(!logIn())
			return;
		System.out.println("Please enter your new password: ");
		String pass = sc.next();
		if (validatePassword(pass))
			this.password = pass;
		else {
			System.out.println("Operation failed. The new password must be 5 characters at least, including one digit, one uppercase letter and one lowercase letter!");
		}
			
	}
	
}
