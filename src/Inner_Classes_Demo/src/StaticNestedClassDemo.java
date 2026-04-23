package Inner_Classes_Demo.src;

class University {
    static String universityName = "National University";

    // Static nested class does not need an outer object.
    static class Department {
        void showDepartment() {
            System.out.println("Department belongs to: " + universityName);
        }
    }
}

public class StaticNestedClassDemo {

    public static void main(String[] args) {
        University.Department department = new University.Department();
        department.showDepartment();
    }
}
