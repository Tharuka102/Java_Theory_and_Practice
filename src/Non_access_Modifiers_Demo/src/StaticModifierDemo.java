package Non_access_Modifiers_Demo.src;

public class StaticModifierDemo {

    // Static field belongs to the class, not to individual objects.
    static int studentCount = 0;

    // Instance field belongs to each object separately.
    String studentName;

    public StaticModifierDemo(String studentName) {
        this.studentName = studentName;
        studentCount++; // Increase the shared class count whenever an object is created.
    }

    // Static method can be called using the class name.
    public static void showStudentCount() {
        System.out.println("Total students created: " + studentCount);
    }

    public static void main(String[] args) {
        new StaticModifierDemo("Akash");
        new StaticModifierDemo("Nimal");

        // Static method call through the class itself.
        StaticModifierDemo.showStudentCount();
    }
}
