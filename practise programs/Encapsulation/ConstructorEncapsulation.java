class Book {

    // Private variables - Encapsulation
    private int bookId;
    private String bookName;
    private double price;

    // Default Constructor
    Book() {
        bookId = 101;
        bookName = "Java";
        price = 450.50;
    }

    // Parameterized Constructor
    Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    // Display method
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Price: " + price);
    }
}

public class ConstructorEncapsulation {

    public static void main(String[] args) {

        // Object using default constructor
        Book b1 = new Book();

        System.out.println("Book 1:");
        b1.display();

        System.out.println();

        // Object using parameterized constructor
        Book b2 = new Book(102, "Python", 500.00);

        System.out.println("Book 2:");
        b2.display();
    }
}