package Inheritance_Demo.src;

public class DiamondProblemDemo {

    // First interface provides a default method.
    interface FirstFeature {
        default void show() {
            System.out.println("Default method from FirstFeature");
        }
    }

    // Second interface provides a method with the same signature.
    interface SecondFeature {
        default void show() {
            System.out.println("Default method from SecondFeature");
        }
    }

    // Java forces the class to resolve the conflict explicitly.
    static class SmartDevice implements FirstFeature, SecondFeature {
        @Override
        public void show() {
            System.out.println("Resolving the diamond problem in Java:");
            FirstFeature.super.show();
            SecondFeature.super.show();
        }
    }

    public static void main(String[] args) {
        SmartDevice device = new SmartDevice();
        device.show();
    }
}
