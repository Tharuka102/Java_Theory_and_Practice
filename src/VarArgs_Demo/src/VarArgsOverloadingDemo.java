package VarArgs_Demo.src;

public class VarArgsOverloadingDemo {

    public static void display(String message) {
        System.out.println("Single message: " + message);
    }

    public static void display(String... messages) {
        System.out.println("Multiple messages:");
        for (String message : messages) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        display("Hello");
        System.out.println();
        display("Java", "VarArgs", "Demo");
    }
}
