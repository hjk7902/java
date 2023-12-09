
public class Book {
	private String title;
	private String author;
	private int pageCount;
	
	

	public Book() {
		this("UnKnown Title", "UnKnown Author");
	}


	public Book(String title, String author) {
		// 주석은 가능
		this(title, author, 0);
	}


	public Book(String title, String author, int pageCount) {
//		super();
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pageCount=" + pageCount + "]";
	}
	
	
}
