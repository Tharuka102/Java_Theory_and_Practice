package Objects_Classes_Variables_Demo.src;

class Employee {
    String name;             // Instance variable
    static String company;   // Static variable shared by all objects

    void show() {
        System.out.println(name + " works at " + company);
    }
}

public class StaticVariableDemo {

    public static void main(String[] args) {
        // Set the shared company name once.
        Employee.company = "ABC Technologies";

        Employee e1 = new Employee();
        e1.name = "Saman";

        Employee e2 = new Employee();
        e2.name = "Ravi";

        e1.show();
        e2.show();
    }
}
