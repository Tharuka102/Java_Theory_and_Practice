package VarArgs_Demo.src;

public class VarArgsBasicsDemo {

    // Varargs allow a method to accept zero or more integer arguments.
    public static void printNumbers(int... numbers) {
        System.out.println("Total numbers received: " + numbers.length);

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }

    public static void main(String[] args) {
        // Calling the same method with different numbers of arguments
        printNumbers();
        System.out.println();

        printNumbers(10);
        System.out.println();

        printNumbers(10, 20, 30, 40);
    }
}
