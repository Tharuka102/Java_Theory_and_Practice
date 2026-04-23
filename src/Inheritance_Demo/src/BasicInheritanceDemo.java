package Inheritance_Demo.src;

public class BasicInheritanceDemo {

    // Parent class contains common data and behavior.
    static class Animal {
        protected String name;

        // Parent constructor initializes the shared field.
        public Animal(String name) {
            this.name = name;
        }

        // Common method available to all child classes.
        public void eat() {
            System.out.println(name + " is eating.");
        }

        // This method can be overridden by child classes.
        public void makeSound() {
            System.out.println(name + " makes a general animal sound.");
        }
    }

    // Dog inherits properties and methods from Animal.
    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        // Overriding the parent method with specific behavior.
        @Override
        public void makeSound() {
            System.out.println(name + " says: Woof!");
        }
    }

    public static void main(String[] args) {
        // Create a child object.
        Dog dog = new Dog("Bruno");

        // Inherited method from the parent class.
        dog.eat();

        // Overridden method from the child class.
        dog.makeSound();
    }
}
