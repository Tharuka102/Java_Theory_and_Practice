package Encapsulation_Demo.src;

class EmployeeRecord {
    // Private final fields can be set once and then only read.
    private final int employeeId;
    private final String employeeName;

    // Constructor initializes the read-only fields.
    public EmployeeRecord(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Getter methods provide read-only access.
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}

public class ReadOnlyEncapsulationDemo {

    public static void main(String[] args) {
        // Create a read-only employee record.
        EmployeeRecord employee = new EmployeeRecord(101, "Nimal");

        // Print the safe read-only values.
        System.out.println("Employee ID   : " + employee.getEmployeeId());
        System.out.println("Employee Name : " + employee.getEmployeeName());
    }
}
