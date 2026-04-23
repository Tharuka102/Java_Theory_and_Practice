package Inner_Classes_Demo.src;

abstract class GreetingBase {
    abstract void greet();
}

public class AnonymousInnerClassDemo {

    public static void main(String[] args) {
        // Anonymous inner class creates an unnamed implementation on the spot.
        GreetingBase greeting = new GreetingBase() {
            void greet() {
                System.out.println("Hello from anonymous inner class");
            }
        };

        greeting.greet();
    }
}
