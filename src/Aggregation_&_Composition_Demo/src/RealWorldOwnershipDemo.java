package Aggregation_

class Book {
    // Book can exist independently in a library system.
    String title;

    public Book(String title) {
        this.title = title;
    }
}

class LibraryMember {
    // A member can borrow an existing book.
    String memberName;
    Book borrowedBook;

    public LibraryMember(String memberName, Book borrowedBook) {
        this.memberName = memberName;
        this.borrowedBook = borrowedBook;
    }

    public void showBorrowedBook() {
        System.out.println(memberName + " borrowed: " + borrowedBook.title);
    }
}

class Heart {
    // Heart is a strong internal part of a Human object.
    public void beat() {
        System.out.println("Heart is beating...");
    }
}

class Human {
    // Human composes a Heart object.
    private Heart heart = new Heart();

    public void live() {
        heart.beat();
        System.out.println("Human is alive.");
    }
}

public class RealWorldOwnershipDemo {

    public static void main(String[] args) {
        // Aggregation example using library objects.
        Book book = new Book("Clean Code");
        LibraryMember member = new LibraryMember("Kamal", book);
        member.showBorrowedBook();

        System.out.println();

        // Composition example using a human and heart.
        Human human = new Human();
        human.live();
    }
}
