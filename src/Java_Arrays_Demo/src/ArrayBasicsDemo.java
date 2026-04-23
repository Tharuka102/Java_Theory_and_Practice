package Java_Arrays_Demo.src;

public class ArrayBasicsDemo {

    public static void main(String[] args) {
        // Creating and initializing an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements using index positions
        System.out.println("First element  : " + numbers[0]);
        System.out.println("Second element : " + numbers[1]);
        System.out.println("Last element   : " + numbers[numbers.length - 1]);
        System.out.println("Array length   : " + numbers.length);
    }
}
