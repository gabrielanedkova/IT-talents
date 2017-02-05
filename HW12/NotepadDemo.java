
public class NotepadDemo {

	public static void main(String[] args) throws Exception {
		
		Page page = new Page("this is a new page", "blablabla");
		System.out.println(page.searchWord("bla"));
		System.out.println(page.lookUpPage());		
		ElectronicSecuredNotepad ebook = new ElectronicSecuredNotepad(3, "Very7trongPassword");
		ebook.addText("text",10);
		ebook.start();
		ebook.addHeader("1", 1);
		ebook.addText("this is first page",1);
		ebook.addText("this is second page",2);
		ebook.addHeader("2", 2);
		ebook.printAllPages();
		ebook.addText("this is a blank page", 2);
		ebook.addHeader("3", 3);
		ebook.addText("this is a 3rd page", 3);
		ebook.addText("this is invalid page", 4);
		ebook.printAllPagesWithDigits();
		ebook.printAllPages();
		ebook.changePassword();
		ebook.deleteText(2);
		ebook.addText("text", 2);
		ebook.deleteAndAddText("something",3);
		ebook.printAllPages();

	}

}
