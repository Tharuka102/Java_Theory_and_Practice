package Java_Memory_Architechture_Demo.src;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ObjectReferenceDemo {

    public static void main(String[] args) {
        // 'studentOne' stores a reference in stack memory.
        // The actual Student object is stored in heap memory.
        Student studentOne = new Student("Nimal");

        // Another reference points to the same object.
        Student studentTwo = studentOne;

        System.out.println("studentOne name = " + studentOne.name);
        System.out.println("studentTwo name = " + studentTwo.name);

        // Change through one reference affects the same heap object.
        studentTwo.name = "Kamal";

        System.out.println("After change through studentTwo:");
        System.out.println("studentOne name = " + studentOne.name);
    }
}
