package Method_

public class TypePromotionOverloadingDemo {

    // Method for int values.
    public void display(int number) {
        System.out.println("Integer value: " + number);
    }

    // Method for double values.
    public void display(double number) {
        System.out.println("Double value: " + number);
    }

    // Method for String values.
    public void display(String text) {
        System.out.println("Text value: " + text);
    }

    public static void main(String[] args) {
        TypePromotionOverloadingDemo demo = new TypePromotionOverloadingDemo();

        // Java selects the best matching overloaded method.
        demo.display(10);
        demo.display(10.5);
        demo.display("Overloading Demo");
    }
}
