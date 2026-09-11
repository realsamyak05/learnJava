class Book{
    private String title;
    private String author;
    private double price;
    private String isbn;
    static final String libraryName = "Sunrise Public Library";
    static int bookCount = 0;

    Book(String title, String author, double price, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        bookCount++;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthour(String author){
        this.author = author;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getISBN(){
        return this.isbn;
    }

    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    
}

public class useCaseOne {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");
        Book b2 = new Book("OOP Concepts", "K. Writer", 420.0, "ISBN002");
 
        System.out.println(b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Price: " + b2.getPrice());
        System.out.println("Library: " + Book.libraryName);
        System.out.println("Total books added: " + Book.bookCount);
}}
