import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) throws LibraryException{
        boolean idExists = books.stream().anyMatch(b -> b.getId() == book.getId());

        if(idExists){
            throw new LibraryException("Error : This id book is already exists");
        }
        books.add(book);
    }

    public void viewAllBooks(){
        if(books.isEmpty()){
            System.out.println("In Library not any book present");
            return;
        }
        books.forEach(System.out::println);
    }

    public Book searchBookById(int id) throws LibraryException{
        return books.stream()
                    .filter(b -> b.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new LibraryException("Error : Book Not Found"));
    }

    public void searchBookByTitle(String title) {
        List<Book> foundBooks = books.stream()
                .filter(b -> b.getTitle().toLowerCase().contains(title.toLowerCase()))
                .toList();

        if (foundBooks.isEmpty()) {
            System.out.println("No book found with this title");
        } else {
            foundBooks.forEach(System.out::println);
        }
    }

    public void updateBook(int id, String newTitle, String newAuthor, String newCategory) throws LibraryException {
        Book book = searchBookById(id);
        book.setTitle(newTitle);
        book.setAuthor(newAuthor);
        book.setCategory(newCategory);
    }

    public void deleteBook(int id) throws LibraryException {
        Book book = searchBookById(id);
        books.remove(book);
    }

    public void borrowBook(int id) throws LibraryException {
        Book book = searchBookById(id);
        if (!book.isAvailable()) {
            throw new LibraryException("Error : Book is already borrowed");
        }
        book.setStatus(BookStatus.BORROWED);
    }

    public void returnBook(int id) throws LibraryException {
        Book book = searchBookById(id);
        if (book.isAvailable()) {
            throw new LibraryException("Error : Book is already available in library");
        }
        book.setStatus(BookStatus.AVAILABLE);
    }

    public void displayAvailableBooks() {
        long count = books.stream().filter(Book::isAvailable).count();
        if (count == 0) {
            System.out.println("No available books at the moment");
            return;
        }
        books.stream()
                .filter(Book::isAvailable)
                .forEach(System.out::println);
    }

    public void displayBooksSortedByTitle() {
        if (books.isEmpty()) {
            System.out.println("In Library not any book present");
            return;
        }
        books.stream()
                .sorted(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER))
                .forEach(System.out::println);
    }

    public void showStatistics() {
        int totalBooks = books.size();
        long availableBooks = books.stream().filter(Book::isAvailable).count();
        long borrowedBooks = books.stream().filter(b -> !b.isAvailable()).count();

        System.out.println("\n======== Library Statistics ========");
        System.out.println("Total Books      : " + totalBooks);
        System.out.println("Available Books  : " + availableBooks);
        System.out.println("Borrowed Books   : " + borrowedBooks);
        System.out.println("====================================");
    }
}
