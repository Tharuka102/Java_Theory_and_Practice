package Java_Memory_Architechture_Demo.src;

public class MethodMemoryDemo {

    public static void main(String[] args) {
        // The main method creates the first stack frame.
        greetUser("Akash");
    }

    public static void greetUser(String name) {
        // This method creates a new stack frame when called.
        int messageCount = 1;
        System.out.println("Hello, " + name + " | count = " + messageCount);

        // Calling another method adds one more frame to the stack.
        showLength(name);
    }

    public static void showLength(String text) {
        int length = text.length();
        System.out.println("Text length = " + length);
    }
}
