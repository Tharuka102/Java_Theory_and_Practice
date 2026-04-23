package Aggregation_

class Department {
    // This variable stores the department name.
    private String departmentName;

    // Constructor initializes the department object.
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Getter method returns the department name.
    public String getDepartmentName() {
        return departmentName;
    }
}

class Employee {
    // This variable stores the employee name.
    private String employeeName;

    // This reference connects the employee to an existing department object.
    private Department department;

    // Constructor receives a Department object from outside.
    public Employee(String employeeName, Department department) {
        this.employeeName = employeeName;
        this.department = department;
    }

    // This method displays employee information.
    public void showDetails() {
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department.getDepartmentName());
        System.out.println();
    }
}

public class AggregationDemo {

    public static void main(String[] args) {
        // The Department object is created independently.
        Department itDepartment = new Department("Information Technology");

        // Multiple employees can share the same Department object.
        Employee employee1 = new Employee("Akash", itDepartment);
        Employee employee2 = new Employee("Nimal", itDepartment);

        // Display the employee details.
        employee1.showDetails();
        employee2.showDetails();

        // This shows aggregation because Employee uses Department,
        // but Department can still exist independently of Employee.
        System.out.println("Aggregation example completed successfully.");
    }
}
