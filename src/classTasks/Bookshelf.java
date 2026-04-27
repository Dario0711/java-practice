package classTasks;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
	
	public List<Book> bookList = new ArrayList<>();
	
	public Bookshelf() {
	
	}
	
	public void addBookToBookshelf(Book book) {
		// if book is already in booklsit then do nothing
		if (!bookList.contains(book)) {
			bookList.add(book);
			System.out.println("Added Book: \"" + book.title + "\" to the Bookshelf");
		}
		else {
			System.out.println("Book is already in the Bookshelf");
		}
	}
	
	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf();
		Book lotr = new Book("Me", "you", 22);
		
		bookshelf.addBookToBookshelf(lotr);
		bookshelf.addBookToBookshelf(lotr);
		
	}
}
