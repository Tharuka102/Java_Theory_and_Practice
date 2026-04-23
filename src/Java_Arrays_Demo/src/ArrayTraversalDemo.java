package Java_Arrays_Demo.src;

public class ArrayTraversalDemo {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};

        // Traversing with a normal for loop
        System.out.println("Using normal for loop:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Index " + i + " -> " + fruits[i]);
        }

        System.out.println();

        // Traversing with an enhanced for-each loop
        System.out.println("Using enhanced for-each loop:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
