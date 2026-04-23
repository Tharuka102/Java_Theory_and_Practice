package Java_Memory_Architechture_Demo.src;

public class StackAndHeapDemo {

    int instanceValue = 100; // Instance variable lives inside the object on the heap.

    public static void main(String[] args) {
        int localNumber = 10; // Local variable is stored in the stack frame of main.

        // Object is created in heap memory.
        StackAndHeapDemo demo = new StackAndHeapDemo();

        System.out.println("Local number from stack: " + localNumber);
        System.out.println("Instance value from heap object: " + demo.instanceValue);
    }
}
