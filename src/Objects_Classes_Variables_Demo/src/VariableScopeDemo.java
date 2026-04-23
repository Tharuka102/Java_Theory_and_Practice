package Objects_Classes_Variables_Demo.src;

public class VariableScopeDemo {

    int instanceValue = 100; // Instance variable can be accessed throughout the object.
    static int staticValue = 500; // Static variable belongs to the class.

    public static void main(String[] args) {
        VariableScopeDemo demo = new VariableScopeDemo();
        demo.showScope();
    }

    public void showScope() {
        int localValue = 50; // Local variable exists only inside this method.

        System.out.println("Local value    = " + localValue);
        System.out.println("Instance value = " + instanceValue);
        System.out.println("Static value   = " + staticValue);

        if (localValue > 10) {
            int blockValue = 999; // Block variable exists only inside this if block.
            System.out.println("Block value    = " + blockValue);
        }

        // blockValue cannot be used here because its scope ended with the block.
    }
}
