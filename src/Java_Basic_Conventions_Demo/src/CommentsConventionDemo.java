package Java_Basic_Conventions_Demo.src;

public class CommentsConventionDemo {

    public static void main(String[] args) {
        // Single-line comment: explains a quick detail
        int total = 100;

        /*
         Multi-line comment:
         explains a larger note or logic block.
        */
        int discount = 20;

        int finalPrice = total - discount;
        System.out.println("Final price = " + finalPrice);
    }
}
