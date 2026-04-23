package Polymorphism_Demo.src;

abstract class Employee {
    // Abstract method must be implemented differently by each employee type.
    public abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Full-time employee salary: Rs.80000");
    }
}

class PartTimeEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Part-time employee salary: Rs.30000");
    }
}

public class RealWorldPolymorphismDemo {

    public static void main(String[] args) {
        // Same parent reference behaves differently for each child type.
        Employee employee1 = new FullTimeEmployee();
        Employee employee2 = new PartTimeEmployee();

        employee1.calculateSalary();
        employee2.calculateSalary();
    }
}
