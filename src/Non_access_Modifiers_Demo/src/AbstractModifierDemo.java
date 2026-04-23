package Non_access_Modifiers_Demo.src;

// Abstract class cannot be instantiated directly.
abstract class Shape {
    // Abstract method must be implemented by subclasses.
    abstract void draw();

    // Concrete method is already implemented.
    void message() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractModifierDemo {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.message();
        shape.draw();
    }
}
