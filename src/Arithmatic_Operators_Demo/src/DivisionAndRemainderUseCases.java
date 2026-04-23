package Arithmatic_Operators_Demo.src;

public class DivisionAndRemainderUseCases {

    public static void main(String[] args) {
        int totalStudents = 23;
        int groupSize = 5;

        // Division gives the number of full groups
        int fullGroups = totalStudents / groupSize;

        // Modulus gives the leftover students
        int remainingStudents = totalStudents % groupSize;

        System.out.println("Total students   = " + totalStudents);
        System.out.println("Group size       = " + groupSize);
        System.out.println("Full groups      = " + fullGroups);
        System.out.println("Remaining people = " + remainingStudents);
        System.out.println();

        // A common use of modulus: checking even or odd numbers
        int number = 14;
        if (number % 2 == 0) {
            System.out.println(number + " is even because remainder is 0 when divided by 2.");
        } else {
            System.out.println(number + " is odd because remainder is not 0 when divided by 2.");
        }
    }
}
