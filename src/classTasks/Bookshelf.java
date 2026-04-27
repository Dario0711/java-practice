package classTasks;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
	
	public List<Book> bookList = new ArrayList<>();
	
	public Bookshelf() {
	
	}
	
	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf();
		Book lotr = new Book("Lord of the Rings", "J.R.R. Tolkien", 510);
		Book hp = new Book("Harry Potter", "J.K. Rowling", 322);
		Book zuffenhausen = new Book("Zuffenhausen", "Dario Cipolletta", 1889);
		
		bookshelf.addBookToBookshelf(lotr);
		bookshelf.addBookToBookshelf(hp);
		bookshelf.addBookToBookshelf(zuffenhausen);
		
		System.out.println(bookshelf.listAllBooks());
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
		
		for (int i = 0; i < bookList.size(); i++) {
			if (allBooks == "") {
				allBooks += bookList.get(i).title;
			}
			else {
				allBooks += ", " + bookList.get(i).title;
				
			}
		}
		return allBooks;
	}
}
