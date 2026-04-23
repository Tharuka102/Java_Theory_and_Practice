package Non_access_Modifiers_Demo.src;

class FinalParent {
    // Final method cannot be overridden in child classes.
    public final void showMessage() {
        System.out.println("This is a final method.");
    }
}

final class UtilityClass {
    // Final class cannot be extended by another class.
    public void printInfo() {
        System.out.println("Utility class information.");
    }
}

public class FinalModifierDemo extends FinalParent {

    // Final variable cannot be reassigned after initialization.
    final double PI = 3.14159;

    public static void main(String[] args) {
        FinalModifierDemo demo = new FinalModifierDemo();
        demo.showMessage();

        UtilityClass utility = new UtilityClass();
        utility.printInfo();

        System.out.println("Final value of PI: " + demo.PI);
    }
}
