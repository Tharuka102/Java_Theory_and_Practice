package Polymorphism_Demo.src;

public class MethodOverloadingPolymorphismDemo {

    // Same method name with integer parameters.
    public int add(int a, int b) {
        return a + b;
    }

    // Same method name with three integer parameters.
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Same method name with decimal parameters.
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingPolymorphismDemo demo = new MethodOverloadingPolymorphismDemo();

        // Compile-time polymorphism selects the correct method by parameters.
        System.out.println("Add two ints    : " + demo.add(10, 20));
        System.out.println("Add three ints  : " + demo.add(10, 20, 30));
        System.out.println("Add two doubles : " + demo.add(10.5, 20.5));
    }
}
