public class Classobjcet
 {
    int bookId;
    String bookName;
    String author;
    double price;

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Classobjcet cs =new Classobjcet();

        cs.bookId=211;
        cs.bookName="venkatapublishers";
        cs.author="venkat";
        cs.price=1020;

        cs.display();
    }
}
