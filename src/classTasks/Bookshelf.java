package classTasks;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
	
	public List<Book> bookList = new ArrayList<>();
	
	public Bookshelf() {
	
	}
	
	public static void main(String[] args) {
		BookshelfCLI.callBookshelfCLi();
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
	
	public String listAllBooks() {
		String allBooks = "";
		
		for (Book book : bookList) {
			if (allBooks == "") {
				allBooks += book.title;
			}
			else {
				allBooks += ", " + book.title;
				
			}
		}
		return allBooks;
	}
	
	public int countUnread() {
		int size = 0;
		
		for (Book book : bookList) {
			if (!book.isRead) {
				size++;
			}
		}
		return size;
	}
}
