package VarArgs_Demo.src;

public class ArrayToVarArgsDemo {

    public static void printSubjects(String... subjects) {
        for (String subject : subjects) {
            System.out.println("Subject: " + subject);
        }
    }

    public static void main(String[] args) {
        // An array can also be passed to a varargs method.
        String[] subjectArray = {"Maths", "Science", "English"};
        printSubjects(subjectArray);
    }
}
