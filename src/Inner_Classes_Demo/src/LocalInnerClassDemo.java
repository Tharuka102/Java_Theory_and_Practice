package Inner_Classes_Demo.src;

public class LocalInnerClassDemo {

    public void showMessage() {
        String text = "Local inner class example";

        // Local inner class is defined inside a method.
        class MessagePrinter {
            void print() {
                System.out.println(text);
            }
        }

        MessagePrinter printer = new MessagePrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalInnerClassDemo demo = new LocalInnerClassDemo();
        demo.showMessage();
    }
}
