package Types_Of_Interfaces_Demo.src;

interface Printable {
    // Marker interface has no methods or fields.
}

class Report implements Printable {
    void printStatus() {
        System.out.println("This report object is printable.");
    }
}

public class MarkerInterfaceDemo {

    public static void main(String[] args) {
        Report report = new Report();

        if (report instanceof Printable) {
            report.printStatus();
        }
    }
}
