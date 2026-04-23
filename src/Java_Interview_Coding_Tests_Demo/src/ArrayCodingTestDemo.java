package Java_Interview_Coding_Tests_Demo.src;

public class ArrayCodingTestDemo {

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 45, 32, 12, 90};
        int max = numbers[0];

        // Find the largest value in the array.
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Largest number = " + max);

        // Count duplicate pairs in a simple way.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate value found: " + numbers[i]);
                }
            }
        }
    }
}
