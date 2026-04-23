package VarArgs_Demo.src;

public class VarArgsWithNormalParametersDemo {

    // Normal parameters can be used before varargs.
    // The varargs parameter must always come last.
    public static void showStudentMarks(String studentName, int... marks) {
        System.out.println("Student: " + studentName);

        int total = 0;
        for (int mark : marks) {
            System.out.println("Mark: " + mark);
            total += mark;
        }

        System.out.println("Total marks: " + total);
    }

    public static void main(String[] args) {
        showStudentMarks("Akash", 75, 80, 90);
    }
}
