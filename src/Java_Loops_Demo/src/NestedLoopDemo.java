package Java_Loops_Demo.src;

public class NestedLoopDemo {

    public static void main(String[] args) {
        // Nested loops are loops inside another loop.
        // They are often used for patterns, tables, and matrix-like data.
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Multiplication table for 3
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }
    }
}
