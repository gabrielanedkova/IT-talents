
public class SimpleNotepad implements INotepad{

	private final Page[] pages;
	
	SimpleNotepad(final int numberOfPages) throws Exception{
		if (numberOfPages < 0)
			throw new Exception("Invalid number of pages");
		this.pages = new Page[numberOfPages];
		for (int i = 0; i < numberOfPages; i++)
			pages[i] = new Page();	
	}
	
	private boolean isValidPage(int pageNumber){
		if (pageNumber <= 0 || pageNumber > pages.length){
			System.out.println("Invalid page number");
			return false;
		}
		return true;	
	}
	
	@Override
	public void addText(String text, int pageNumber) {
		if(isValidPage(pageNumber))
			pages[pageNumber - 1].addText(text);		
	}

	@Override
	public void deleteText(int pageNumber) {
		if(isValidPage(pageNumber))
			pages[pageNumber - 1].deleteText();
	}

	@Override
	public boolean searchWord(String word) {
		for(int i = 0; i < pages.length; i++)
			if (pages[i].searchWord(word))
				return true;
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for(int i = 0; i < pages.length; i++){
			if (pages[i].containsDigits())
				System.out.println(pages[i].lookUpPage());
		}
		
	}
	@Override
	public void addHeader(String header, int pageNumber) {
		if(isValidPage(pageNumber))
			pages[pageNumber - 1].addHeader(header);
	}
	
	@Override
	public void deleteHeader(int pageNumber) {
		if(isValidPage(pageNumber))
			pages[pageNumber - 1].deleteHeader();
	}
	@Override
	public void deleteAndAddText(String text, int pageNumber) {
		if(isValidPage(pageNumber)){
			pages[pageNumber - 1].deleteText();
			pages[pageNumber - 1].addText(text);
		}
	}
	@Override
	public void printAllPages() {
		for(int i = 0; i < pages.length; i++)
			System.out.println(pages[i].lookUpPage());
	}

}
