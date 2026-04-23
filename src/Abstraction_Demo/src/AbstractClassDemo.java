package Abstraction_Demo.src;

// Abstract class defines common structure and behavior.
abstract class Animal {
    // Concrete field shared by subclasses.
    protected String name;

    // Constructor sets the common name.
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method must be implemented by subclasses.
    public abstract void makeSound();

    // Concrete method is already implemented in the parent.
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Subclass provides its own implementation.
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {
        // Create a Dog object using the abstract parent reference.
        Animal animal = new Dog("Bruno");

        // Call the subclass-specific implementation.
        animal.makeSound();

        // Call the shared concrete method.
        animal.sleep();
    }
}
