package Java_Interview_Coding_Tests_Demo.src;

public class ReverseStringDemo {

    public static void main(String[] args) {
        String original = "Java Interview";
        String reversed = "";

        // Start from the last character and move to the first.
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original string = " + original);
        System.out.println("Reversed string = " + reversed);
    }
}
