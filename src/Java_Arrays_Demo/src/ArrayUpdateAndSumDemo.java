package Java_Arrays_Demo.src;

public class ArrayUpdateAndSumDemo {

    public static void main(String[] args) {
        int[] marks = {75, 80, 90, 65, 88};

        // Updating an element in the array
        marks[3] = 70;

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.length;

        System.out.println("Updated mark at index 3 = " + marks[3]);
        System.out.println("Total marks             = " + sum);
        System.out.println("Average                 = " + average);
    }
}
