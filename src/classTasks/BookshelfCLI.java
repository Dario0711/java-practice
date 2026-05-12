package classTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfCLI {
	
	// Renamed: callBookshelfCLi -> run
	public static void run() {
		Bookshelf shelf = new Bookshelf();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter command: 'add', 'list', 'read', 'unread' or 'quit'");
		
		while (true) {
			String input = scanner.nextLine().toLowerCase();
			
			switch (input) {
				case "quit":
					System.out.println("Goodbye!");
					return;
				case "add":
					handleAdd(shelf, scanner);
					break;
				case "list":
					System.out.println(shelf.list());
					break;
				case "read":
					System.out.println("Enter title to mark as read: ");
					String title = scanner.nextLine();
					if (!shelf.markRead(title)) {
						System.out.println("Book not found!");
					}
					break;
				case "unread":
					System.out.println("Unread count: " + shelf.countUnread());
					break;
				default:
					System.out.println("Unknown command.");
			}
		}
	}
	
	// Extracted logic to keep the switch statement clean
	private static void handleAdd(Bookshelf shelf, Scanner scanner) {
		System.out.println("Title: ");
		String title = scanner.nextLine();
		System.out.println("Author: ");
		String author = scanner.nextLine();
		
		int pages = -1;
		while (pages < 0) {
			System.out.println("Pages: ");
			try {
				pages = scanner.nextInt();
				scanner.nextLine();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Invalid input. Enter a number.");
			}
		}
		shelf.add(new Book(title, author, pages));
	}
}