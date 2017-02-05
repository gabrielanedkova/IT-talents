
public class Page {
	
	private String header;
	private String text;
	public String addHeader;

	Page(){
		this.header = "";
		this.text = "";
	}
	
	Page(String header, String text){
		this.header = header;
		this.text = text;	
	}
	
	
	void addText(String text){
			this.text = this.text.concat(" " + text);
	}
	
	void deleteText(){
		this.text = "";
	}
	
	String lookUpPage(){
		String page = new String(header +"\n" + text);
		return page;
	}
	
	boolean searchWord(String word){
		if (word == null)
			return false;
		return this.text.contains(word);		
	}

	boolean containsDigits(){
		if (this.text == null)
			return false;
		return this.text.matches(".*\\d+.*");
	}

	void deleteHeader() {
		this.header = "";
	}

	void addHeader(String header){
		this.header = header;

	}
}
