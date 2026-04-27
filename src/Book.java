public class Book {
	
	public String title;
	public String author;
	public int pagecount;
	public boolean isRead = false;
	
	public static void main(String[] args) {
		Book lotr = new Book("Lord of the Rings", "J.R.R. Tolkien", 510);
		Book hp = new Book("Harry Potter", "J.K. Rowling", 322);
		Book zuffenhausen = new Book("Zuffenhausen", "Dario Cipolletta", 1889);
		
		lotr.returnBookDescription();
		lotr.markAsRead();
		lotr.returnBookDescription();
	}
	
	public Book(String title, String author, int pagecount) {
		this.title = title;
		this.author = author;
		this.pagecount = pagecount;
	}
	
	private String returnBookDescription() {
		String bookInformation;
		String read;
		if (isRead) {
			read = "read";
		}
		else {
			read = "unread";
		}
		bookInformation = "\"" + title + "\" by " + author + "(" + String.valueOf(pagecount) + ") [" + read + "]";
		return bookInformation;
	}
	
	private void markAsRead() {
		isRead = true;
	}
}
