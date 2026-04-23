package Searching_And_Sorting_Algorithms_Demo.src;

public class BinarySearchDemo {

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Binary search requires a sorted array
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println(target + " found at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
