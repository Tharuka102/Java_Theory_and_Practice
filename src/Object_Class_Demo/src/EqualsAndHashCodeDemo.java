package Object_Class_Demo.src;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Overriding equals to compare object content.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;
        return title.equals(other.title) && author.equals(other.author);
    }

    // Overriding hashCode to match equals logic.
    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }
}

public class EqualsAndHashCodeDemo {

    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "Smith");
        Book book2 = new Book("Java Basics", "Smith");

        // equals compares content after overriding.
        System.out.println("book1.equals(book2): " + book1.equals(book2));

        // hashCode values should also match for equal objects.
        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book2.hashCode(): " + book2.hashCode());
    }
}
