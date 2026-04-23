package Polymorphism_Demo.src;

class Animal {
    // Parent method can be overridden by child classes.
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class MethodOverridingPolymorphismDemo {

    public static void main(String[] args) {
        // Runtime polymorphism with parent references.
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound();
        animal2.sound();
    }
}
