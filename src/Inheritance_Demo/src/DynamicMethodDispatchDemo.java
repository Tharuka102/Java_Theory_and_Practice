package Inheritance_Demo.src;

public class DynamicMethodDispatchDemo {

    static class Shape {
        public void draw() {
            System.out.println("Drawing a generic shape.");
        }
    }

    static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }

    static class Rectangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle.");
        }
    }

    public static void main(String[] args) {
        // Parent reference points to child object.
        Shape shape;

        shape = new Circle();
        shape.draw(); // Runtime decides the actual method.

        shape = new Rectangle();
        shape.draw(); // Again resolved dynamically at runtime.
    }
}
