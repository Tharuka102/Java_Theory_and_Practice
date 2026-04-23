package Java_Basic_Conventions_Demo.src;

public class NamingConventionsDemo {

    public static void main(String[] args) {
        // Class names use PascalCase
        StudentRecord studentRecord = new StudentRecord();
        studentRecord.showStudentDetails();
    }
}

class StudentRecord {
    // Variable and method names use camelCase
    String studentName = "Akash";
    int studentAge = 22;

    void showStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age : " + studentAge);
    }
}
