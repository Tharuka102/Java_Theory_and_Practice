package Searching_And_Sorting_Algorithms_Demo.src;

public class LinearSearchDemo {

    public static int linearSearch(int[] array, int target) {
        // Check each element one by one until the target is found
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // return the index where the target was found
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] numbers = {12, 25, 37, 49, 58};
        int target = 37;

        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println(target + " found at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
