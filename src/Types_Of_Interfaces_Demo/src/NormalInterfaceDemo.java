package Types_Of_Interfaces_Demo.src;

interface Animal {
    void sound(); // Abstract method to be implemented by child classes.
    void eat();   // Another abstract method.
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats food");
    }
}

public class NormalInterfaceDemo {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        animal.eat();
    }
}
