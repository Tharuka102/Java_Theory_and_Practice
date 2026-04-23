package Method_

public class RealWorldCalculatorOverloadingDemo {

    // Overloaded add method for two integers.
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded add method for three integers.
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded add method for two decimal numbers.
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        RealWorldCalculatorOverloadingDemo calculator = new RealWorldCalculatorOverloadingDemo();

        System.out.println("Add two ints     : " + calculator.add(5, 10));
        System.out.println("Add three ints   : " + calculator.add(5, 10, 15));
        System.out.println("Add two doubles  : " + calculator.add(5.5, 10.5));
    }
}
