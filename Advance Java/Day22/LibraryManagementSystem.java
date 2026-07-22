import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagementSystem {
    private Map<Integer, String> bookMap;

    public LibraryManagementSystem() {
        bookMap = new HashMap<>();
    }

    public void addBook(int bookId, String bookName) {
        if (bookMap.containsKey(bookId)) {
            System.out.println("Book ID " + bookId + " already exists.");
        } else {
            bookMap.put(bookId, bookName);
            System.out.println("Book added successfully.");
        }
    }

    public void searchBook(int bookId) {
        if (bookMap.containsKey(bookId)) {
            System.out.println("Book Found - ID: " + bookId + ", Name: " + bookMap.get(bookId));
        } else {
            System.out.println("Book ID " + bookId + " not found.");
        }
    }

    public void removeBook(int bookId) {
        if (bookMap.containsKey(bookId)) {
            String removedBook = bookMap.remove(bookId);
            System.out.println("Removed book: " + removedBook);
        } else {
            System.out.println("Book ID " + bookId + " not found.");
        }
    }

    public void displayBooks() {
        if (bookMap.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("--- Library Book Records ---");
        for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
            System.out.println("Book ID: " + entry.getKey() + ", Book Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*** Library Menu ***");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Book Name: ");
                    String name = scanner.nextLine();
                    library.addBook(id, name);
                    break;
                case 2:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = scanner.nextInt();
                    library.searchBook(searchId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to Remove: ");
                    int removeId = scanner.nextInt();
                    library.removeBook(removeId);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting Library Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
