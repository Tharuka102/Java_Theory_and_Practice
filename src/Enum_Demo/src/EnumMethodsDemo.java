package Enum_Demo.src;

// Enum representing order status.
enum OrderStatus {
    PENDING, SHIPPED, DELIVERED, CANCELLED
}

public class EnumMethodsDemo {

    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;

        // name() returns the exact enum constant name.
        System.out.println("Name    : " + status.name());

        // ordinal() returns the position index of the constant.
        System.out.println("Ordinal : " + status.ordinal());

        // valueOf() converts text to the matching enum constant.
        OrderStatus converted = OrderStatus.valueOf("DELIVERED");
        System.out.println("Converted status: " + converted);
    }
}
