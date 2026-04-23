package Java_Basic_Conventions_Demo.src;

/**
 * This class demonstrates JavaDoc style comments.
 * JavaDoc is used to describe classes and methods clearly.
 */
public class JavaDocConventionDemo {

    /**
     * Adds two numbers and returns the result.
     *
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum = " + add(10, 20));
    }
}
