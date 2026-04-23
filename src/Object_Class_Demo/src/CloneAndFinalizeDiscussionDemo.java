package Object_Class_Demo.src;

class Product implements Cloneable {
    String name;

    public Product(String name) {
        this.name = name;
    }

    // clone creates a shallow copy of the object.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneAndFinalizeDiscussionDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Product original = new Product("Laptop");
        Product copied = (Product) original.clone();

        System.out.println("Original product: " + original.name);
        System.out.println("Cloned product  : " + copied.name);

        // finalize is deprecated in modern Java and should generally be avoided.
        System.out.println("Note: finalize() is deprecated and not recommended for modern code.");
    }
}
