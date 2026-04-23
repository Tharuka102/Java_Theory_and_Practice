package Java_Loops_Demo.src;

public class ForLoopDemo {

    public static void main(String[] args) {
        // A for loop is best when the number of repetitions is known.
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop count: " + i);
        }

        System.out.println();

        // Example: printing even numbers from 2 to 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even number: " + i);
        }
    }
}
