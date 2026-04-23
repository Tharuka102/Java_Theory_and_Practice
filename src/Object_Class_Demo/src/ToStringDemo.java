package Object_Class_Demo.src;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString gives a meaningful text representation.
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class ToStringDemo {

    public static void main(String[] args) {
        Student student = new Student(101, "Akash");

        // Printing the object automatically calls toString().
        System.out.println(student);
    }
}
