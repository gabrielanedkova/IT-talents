
public interface INotepad {

	void addText(String text, int pageNumber);
	void deleteAndAddText(String text, int pageNumber);
	void deleteText(int pageNumber);
	public void addHeader(String header, int pageNumber);
	public void deleteHeader(int pageNumber);
	boolean searchWord(String word);
	void printAllPages();
	void printAllPagesWithDigits(); 
}
