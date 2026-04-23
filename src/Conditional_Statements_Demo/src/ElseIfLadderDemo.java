package Conditional_Statements_Demo.src;

public class ElseIfLadderDemo {

    public static void main(String[] args) {
        int marks = 82;

        // else-if ladder is useful when there are many conditions to check.
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 65) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
