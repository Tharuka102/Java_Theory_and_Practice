package VarArgs_Demo.src;

public class VarArgsSumDemo {

    // This method can accept any number of integer values and return their sum.
    public static int findSum(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, 3 = " + findSum(1, 2, 3));
        System.out.println("Sum of 10, 20, 30, 40 = " + findSum(10, 20, 30, 40));
        System.out.println("Sum with no values = " + findSum());
    }
}
