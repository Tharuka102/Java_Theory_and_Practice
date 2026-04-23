package Objects_Classes_Variables_Demo.src;

class Book {
    String title;
    double price;

    // Constructor initializes object data during creation.
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Title = " + title + ", Price = " + price);
    }
}

public class ConstructorAndVariableDemo {

    public static void main(String[] args) {
        // Create objects using the constructor.
        Book b1 = new Book("Java Basics", 2500.00);
        Book b2 = new Book("OOP Concepts", 3200.00);

        b1.displayBook();
        b2.displayBook();
    }
}
