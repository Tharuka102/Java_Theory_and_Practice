package Method_

public class VarArgsOverloadingDemo {

    // Fixed two-parameter version.
    public void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    // Varargs version accepts many numbers.
    public void add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum using varargs: " + sum);
    }

    public static void main(String[] args) {
        VarArgsOverloadingDemo demo = new VarArgsOverloadingDemo();

        // Calls the exact two-parameter version.
        demo.add(10, 20);

        // Calls the varargs version.
        demo.add(1, 2, 3, 4, 5);
    }
}
