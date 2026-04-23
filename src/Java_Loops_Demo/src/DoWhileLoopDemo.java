package Java_Loops_Demo.src;

public class DoWhileLoopDemo {

    public static void main(String[] args) {
        // A do-while loop runs the block at least once before checking the condition.
        int number = 1;

        do {
            System.out.println("Do-while value: " + number);
            number++;
        } while (number <= 5);

        System.out.println();

        // This example still runs once even though the condition is false at the start.
        int test = 10;
        do {
            System.out.println("This prints once even when the condition is already false.");
        } while (test < 5);
    }
}
