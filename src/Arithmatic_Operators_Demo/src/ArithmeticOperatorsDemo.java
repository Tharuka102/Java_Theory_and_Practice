package Arithmatic_Operators_Demo.src;

public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        // Basic arithmetic operators with integers
        System.out.println("First number  : " + a);
        System.out.println("Second number : " + b);
        System.out.println();

        System.out.println("Addition (a + b)       = " + (a + b));   // 15 + 4 = 19
        System.out.println("Subtraction (a - b)    = " + (a - b));   // 15 - 4 = 11
        System.out.println("Multiplication (a * b) = " + (a * b));   // 15 * 4 = 60
        System.out.println("Division (a / b)       = " + (a / b));   // 15 / 4 = 3 (integer division)
        System.out.println("Modulus (a % b)        = " + (a % b));   // 15 % 4 = 3 (remainder)
        System.out.println();

        // Decimal division example using casting
        double exactAnswer = (double) a / b;
        System.out.println("Exact division using casting = " + exactAnswer); // 3.75
        System.out.println();

        // Unary plus and minus
        int positive = +a;
        int negative = -a;
        System.out.println("Unary plus  (+a) = " + positive);
        System.out.println("Unary minus (-a) = " + negative);
        System.out.println();

        // Compound assignment operators
        int score = 10;
        System.out.println("Initial score = " + score);

        score += 5; // score = score + 5
        System.out.println("After score += 5 -> " + score);

        score -= 3; // score = score - 3
        System.out.println("After score -= 3 -> " + score);

        score *= 2; // score = score * 2
        System.out.println("After score *= 2 -> " + score);

        score /= 4; // score = score / 4
        System.out.println("After score /= 4 -> " + score);

        score %= 3; // score = score % 3
        System.out.println("After score %= 3 -> " + score);
    }
}
