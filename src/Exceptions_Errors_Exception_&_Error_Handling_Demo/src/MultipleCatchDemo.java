package Exceptions_Errors_Exception_

public class MultipleCatchDemo {

    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length()); // May throw NullPointerException.

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // May throw ArrayIndexOutOfBoundsException.
        } catch (NullPointerException e) {
            System.out.println("Null error handled: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error handled: " + e.getMessage());
        }
    }
}
