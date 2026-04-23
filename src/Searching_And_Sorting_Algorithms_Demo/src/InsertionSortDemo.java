package Searching_And_Sorting_Algorithms_Demo.src;

import java.util.Arrays;

public class InsertionSortDemo {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move larger elements one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {9, 5, 1, 4, 3};

        System.out.println("Before sorting: " + Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("After sorting : " + Arrays.toString(numbers));
    }
}
