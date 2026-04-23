package Java_Loops_Demo.src;

public class BreakAndContinueDemo {

    public static void main(String[] args) {
        // break ends the loop immediately
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking the loop at i = " + i);
                break;
            }
            System.out.println("Value before break: " + i);
        }

        System.out.println();

        // continue skips the current iteration and moves to the next one
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue;
            }
            System.out.println("Value after continue check: " + i);
        }
    }
}
