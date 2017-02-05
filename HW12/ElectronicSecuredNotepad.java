
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{

	private boolean isStarted;

	ElectronicSecuredNotepad(int numberOfPages, String password) throws Exception {
		super(numberOfPages, password);
		isStarted = false;
	}
	
	@Override
	public void start() {
		if(super.logIn())
			isStarted = true;
	}

	@Override
	public void stop() {
		isStarted = false;	
	}

	@Override
	public boolean isStarted() {
		return isStarted;
	}

	@Override
	public void addText(String text, int pageNumber) {
		if (!isStarted()){
			System.out.println("The device is turned off");
			return;
		}
		super.addText(text, pageNumber);
	}

	@Override
	public void addHeader(String header, int pageNumber) {
		if (!isStarted()){
			System.out.println("The device is turned off");
			return;
		}
		super.addHeader(header, pageNumber);
	}

	@Override
	public void deleteHeader(int pageNumber) {
		if (!isStarted()){
			System.out.println("The device is turned off");
			return;
	}
		super.deleteHeader(pageNumber);
		
	}

	@Override
	public void deleteAndAddText(String text, int pageNumber) {
		if (!isStarted()){
			System.out.println("The device is turned off");
			return;
		}
		super.deleteAndAddText(text, pageNumber);
	}

	@Override
	public void deleteText(int pageNumber) {
		if (!isStarted()){
			System.out.println("The device is turned off");
			return;
		}
		super.deleteText(pageNumber);
	}

	@Override
	public boolean searchWord(String word) {
		if (!isStarted()){
			System.out.println("The device is turned off");
			return false;
		}
		return super.searchWord(word);
	}

	@Override
	public void printAllPages() {
		if (!isStarted()){
			System.out.println("The device is turned off");
			return;
		}
		super.printAllPages();
	}

	@Override
	public void printAllPagesWithDigits() {
		if (!isStarted()){
			System.out.println("The device is turned off");
			return;
		}
		super.printAllPagesWithDigits();
	}

}
