public class Book {
    private int id;
    private String title;
    private String author;
    private String category;
    private BookStatus status;

    public Book(int id, String title, String author, String category){
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.status = BookStatus.AVAILABLE;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public BookStatus getStatus(){
        return status;
    }
    public void setStatus(BookStatus status){
        this.status = status;
    }

    public boolean isAvailable(){
        return this.status == BookStatus.AVAILABLE;
    }

    @Override
    public String toString(){
         return String.format("ID: %d | Title: %s | Author: %s | Category: %s | Status: %s", 
         id, title, author, category, status);
    }

    public String toFileString(){
        return id + "," + title + "," + author + "," + category + "," + status;
    }

     public static Book fromFileString(String line){
        String [] parts = line.split(",");
        int id = Integer.parseInt(parts[0]);
        Book book = new Book(id, parts[1], parts[2], parts[3]);
        book.setStatus(BookStatus.valueOf(parts[4]));
        return book;
     }
}