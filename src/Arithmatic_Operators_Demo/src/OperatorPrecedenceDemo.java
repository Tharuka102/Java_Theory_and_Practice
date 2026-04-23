package Arithmatic_Operators_Demo.src;

public class OperatorPrecedenceDemo {

    public static void main(String[] args) {
        // Multiplication happens before addition
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1); // 20

        // Parentheses change the order of evaluation
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2); // 30

        // More examples
        int result3 = 20 - 8 / 2;
        System.out.println("20 - 8 / 2 = " + result3); // 16

        int result4 = (20 - 8) / 2;
        System.out.println("(20 - 8) / 2 = " + result4); // 6

        // Best practice: use parentheses when the intent should be very clear
        int marks = 80;
        int bonus = 5;
        int finalMarks = (marks + bonus) * 2;
        System.out.println("Final marks = " + finalMarks);
    }
}
