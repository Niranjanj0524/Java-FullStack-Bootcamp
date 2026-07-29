import java.util.Scanner;

public class Menu {
    private final Library library;
    private final Scanner sc;

    public Menu(Library library) {
        this.library = library;
        this.sc = new Scanner(System.in);
    }

    public void display() {
        while (true) {
            System.out.println("\n======== Library Management ========");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Statistics");
            System.out.println("9. Exit");
            System.out.print("Choice : ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 9) {
                    FileManager.addBook(library);
                    System.out.println("Data saved successfully. Goodbye!");
                    break;
                }
                handleChoice(choice);
            } catch (NumberFormatException e) {
                System.out.println("Error : Invalid Input. Please enter a number.");
            }
        }
    }

    private void handleChoice(int choice) {
        try {
            switch (choice) {
                case 1:
                    addBookMenu();
                    break;
                case 2:
                    viewBooksMenu();
                    break;
                case 3:
                    searchBookMenu();
                    break;
                case 4:
                    updateBookMenu();
                    break;
                case 5:
                    deleteBookMenu();
                    break;
                case 6:
                    borrowBookMenu();
                    break;
                case 7:
                    returnBookMenu();
                    break;
                case 8:
                    library.showStatistics();
                    break;
                default:
                    System.out.println("Error : Invalid choice. Try again.");
            }
        } catch (LibraryException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error : An unexpected error occurred: " + e.getMessage());
        }
    }

    private void addBookMenu() throws LibraryException {
        System.out.print("Enter Book ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        Book book = new Book(id, title, author, category);
        library.addBook(book);
        System.out.println("Book Added Successfully");
    }

    private void viewBooksMenu() {
        System.out.println("\n1. View All Books");
        System.out.println("2. View Available Books");
        System.out.println("3. View Sorted Books by Title");
        System.out.print("Choice : ");
        int subChoice = Integer.parseInt(sc.nextLine());

        switch (subChoice) {
            case 1 -> library.viewAllBooks();
            case 2 -> library.displayAvailableBooks();
            case 3 -> library.displayBooksSortedByTitle();
            default -> System.out.println("Error : Invalid Choice");
        }
    }

    private void searchBookMenu() throws LibraryException {
        System.out.println("\n1. Search by ID");
        System.out.println("2. Search by Title");
        System.out.print("Choice : ");
        int subChoice = Integer.parseInt(sc.nextLine());

        if (subChoice == 1) {
            System.out.print("Enter Book ID: ");
            int id = Integer.parseInt(sc.nextLine());
            Book book = library.searchBookById(id);
            System.out.println(book);
        } else if (subChoice == 2) {
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();
            library.searchBookByTitle(title);
        } else {
            System.out.println("Error : Invalid Choice");
        }
    }

    private void updateBookMenu() throws LibraryException {
        System.out.print("Enter Book ID to Update: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter New Title: ");
        String title = sc.nextLine();
        System.out.print("Enter New Author: ");
        String author = sc.nextLine();
        System.out.print("Enter New Category: ");
        String category = sc.nextLine();

        library.updateBook(id, title, author, category);
        System.out.println("Book Updated Successfully");
    }

    private void deleteBookMenu() throws LibraryException {
        System.out.print("Enter Book ID to Delete: ");
        int id = Integer.parseInt(sc.nextLine());
        library.deleteBook(id);
        System.out.println("Book Deleted Successfully");
    }

    private void borrowBookMenu() throws LibraryException {
        System.out.print("Enter Book ID to Borrow: ");
        int id = Integer.parseInt(sc.nextLine());
        library.borrowBook(id);
        System.out.println("Book Borrowed Successfully");
    }

    private void returnBookMenu() throws LibraryException {
        System.out.print("Enter Book ID to Return: ");
        int id = Integer.parseInt(sc.nextLine());
        library.returnBook(id);
        System.out.println("Book Returned Successfully");
    }
}
