public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        
        FileManager.viewAllBooks(library);
        
        Menu menu = new Menu(library);
        menu.display();
    }
}
