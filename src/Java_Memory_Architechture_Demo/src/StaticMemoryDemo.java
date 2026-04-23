package Java_Memory_Architechture_Demo.src;

public class StaticMemoryDemo {

    static int sharedCounter = 0; // Static variable is shared at class level.

    public StaticMemoryDemo() {
        sharedCounter++;
    }

    public static void main(String[] args) {
        new StaticMemoryDemo();
        new StaticMemoryDemo();
        new StaticMemoryDemo();

        // All objects see the same static variable value.
        System.out.println("Shared counter = " + sharedCounter);
    }
}
