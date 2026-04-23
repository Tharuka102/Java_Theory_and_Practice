package Generics_Demo.src;

public class GenericMethodDemo {

    // Generic method works with different data types.
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        String[] words = {"Java", "Generic", "Method"};

        printArray(numbers);
        printArray(words);
    }
}
