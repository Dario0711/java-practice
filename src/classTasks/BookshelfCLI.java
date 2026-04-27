package classTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfCLI {
	
	public static void callBookshelfCLi() {
		Bookshelf shelfi = new Bookshelf();
		Scanner myScanner = new Scanner(System.in);
		
		// Fixed: Updated prompt to match logic
		System.out.println("Enter command: 'add', 'list', 'read', 'unread' or 'quit' to exit");
		
		while (true) {
			String input = myScanner.nextLine();
			
			switch (input.toLowerCase()) {
				case "quit":
					System.out.println("Goodbye!");
					return;
				case "add":
					System.out.println("Please enter the title of the book: ");
					String title = myScanner.nextLine();
					
					System.out.println("Please enter the author of the book: ");
					String author = myScanner.nextLine();
					
					int pages = -1;
					while (pages < 0) {
						System.out.println("Please enter the amount of pages: ");
						try {
							pages = myScanner.nextInt();
							myScanner.nextLine();
						} catch (InputMismatchException e) {
							myScanner.nextLine();
							System.out.println("Invalid input. Please enter a number.");
						}
					}
					
					Book test = new Book(title, author, pages);
					System.out.println(test.returnBookDescription() + " has been created!");
					shelfi.addBookToBookshelf(test);
					break;
				
				case "list":
					System.out.println(shelfi.listAllBooks());
					break;
				case "read":
					System.out.println("Please enter the title of the book you want to mark as read: ");
					String bookToMark = myScanner.nextLine();
					boolean found = false;
					for (Book book : shelfi.bookList) {
						if (book.title.equalsIgnoreCase(bookToMark)) {
							book.markAsRead();
							System.out.println("The book with the title " + book.title + " has been marked as read");
							found = true;
							break;
						}
						
					}
					if (!found) {
						System.out.println("Book has not been found!");
					}
					break;
				case "unread":
					System.out.println(shelfi.countUnread());
					break;
				
				default:
					System.out.println("Unknown command.");
					break;
			}
		}
	}
}