package classTasks;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
	
	// Encapsulation: private list
	private List<Book> books = new ArrayList<>();
	
	public static void main(String[] args) {
		BookshelfCLI.run();
	}
	
	public void add(Book book) {
		if (!books.contains(book)) {
			books.add(book);
		}
	}
	
	public String list() {
		if (books.isEmpty()) {
			return "Empty";
		}
		
		List<String> titles = new ArrayList<>();
		for (Book book : books) {
			titles.add(book.getTitle());
		}
		return String.join(", ", titles);
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
	public int countUnread() {
		int count = 0;
		// Fixed: Changed bookList to books
		for (Book book : books) {
			if (!book.isRead()) {
				count++;
			}
		}
		return count;
	}
	
	public boolean markRead(String title) {
		// Fixed: Changed bookList to books
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				book.markAsRead();
				return true;
			}
		}
		return false;
	}
}