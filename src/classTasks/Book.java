package classTasks;

public class Book {
	
	private String title;
	private String author;
	private int pageCount;
	private boolean isRead = false;
	
	public String getTitle() {
		return title;
	}
	
	public boolean isRead() {
		return isRead;
	}
	
	public static void main(String[] args) {
		// Use descriptive names instead of generic placeholders
		Book lordOfTheRings = new Book("Lord of the Rings", "J.R.R. Tolkien", 510);
		Book harryPotter = new Book("Harry Potter", "J.K. Rowling", 322);
		Book zuffenhausen = new Book("Zuffenhausen", "Dario Cipolletta", 1889);
		
		System.out.println(lordOfTheRings);
		System.out.println(harryPotter);
		System.out.println(zuffenhausen);
		
		zuffenhausen.markAsRead();
		
		System.out.println(zuffenhausen);
	}
	
	public Book(String title, String author, int pageCount) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}
	
	@Override
	public String toString() {
		String read = isRead ? "read" : "unread";
		return "\"" + title + "\" by " + author + " (" + pageCount + ") [" + read + "]";
	}
	
	public void markAsRead() {
		isRead = true;
	}
}
