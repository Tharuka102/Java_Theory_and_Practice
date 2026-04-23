package Inheritance_Demo.src;

public class InterfaceInheritanceDemo {

    // Interface defines a contract.
    interface Printable {
        void print();
    }

    // Another interface adds more behavior.
    interface Scannable {
        void scan();
    }

    // A class can implement multiple interfaces in Java.
    static class MultiFunctionPrinter implements Printable, Scannable {
        @Override
        public void print() {
            System.out.println("Printing the document...");
        }

        @Override
        public void scan() {
            System.out.println("Scanning the document...");
        }
    }

    public static void main(String[] args) {
        MultiFunctionPrinter device = new MultiFunctionPrinter();
        device.print();
        device.scan();
    }
}
