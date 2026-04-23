package Java_Loops_Demo.src;

public class WhileLoopDemo {

    public static void main(String[] args) {
        // A while loop is useful when the number of repetitions is not fixed in advance.
        int count = 1;

        while (count <= 5) {
            System.out.println("While loop count: " + count);
            count++;
        }

        System.out.println();

        // Countdown example
        int countdown = 5;
        while (countdown >= 1) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }
    }
}
