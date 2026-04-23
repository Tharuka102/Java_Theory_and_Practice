package Method_

public class MethodOverloadingDemo {

    // Same method name with no parameters.
    public void greet() {
        System.out.println("Hello!");
    }

    // Same method name with one parameter.
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Same method name with two parameters.
    public void greet(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        // Calling different overloaded methods.
        demo.greet();
        demo.greet("Akash");
        demo.greet("Nimal", 22);
    }
}
