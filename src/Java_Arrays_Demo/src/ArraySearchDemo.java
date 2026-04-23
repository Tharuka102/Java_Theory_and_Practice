package Java_Arrays_Demo.src;

public class ArraySearchDemo {

    public static void main(String[] args) {
        int[] values = {12, 25, 37, 49, 58};
        int target = 37;
        boolean found = false;

        // Linear search through the array
        for (int value : values) {
            if (value == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " was found in the array.");
        } else {
            System.out.println(target + " was not found in the array.");
        }
    }
}
