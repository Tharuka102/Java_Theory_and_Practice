package Inheritance_Demo.src;

public class CovariantReturnTypeDemo {

    static class Animal {
        public String getType() {
            return "Generic Animal";
        }
    }

    static class Dog extends Animal {
        @Override
        public String getType() {
            return "Dog";
        }

        public void bark() {
            System.out.println("Dog is barking.");
        }
    }

    static class AnimalFactory {
        public Animal createAnimal() {
            return new Animal();
        }
    }

    static class DogFactory extends AnimalFactory {
        // Covariant return type allows returning a child type.
        @Override
        public Dog createAnimal() {
            return new Dog();
        }
    }

    public static void main(String[] args) {
        AnimalFactory factory = new DogFactory();
        Animal animal = factory.createAnimal();

        System.out.println("Created type: " + animal.getType());

        if (animal instanceof Dog) {
            ((Dog) animal).bark();
        }
    }
}
