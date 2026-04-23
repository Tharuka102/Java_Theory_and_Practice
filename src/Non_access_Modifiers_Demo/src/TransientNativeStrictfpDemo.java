package Non_access_Modifiers_Demo.src;

public strictfp class TransientNativeStrictfpDemo {

    // Transient field is ignored during serialization.
    transient String temporaryPassword = "secret123";

    // Normal field is treated as regular object data.
    String userName = "Akash";

    // Native method declaration tells Java the implementation exists in another language.
    public native void connectToSystem();

    public static void main(String[] args) {
        TransientNativeStrictfpDemo demo = new TransientNativeStrictfpDemo();

        System.out.println("Username          : " + demo.userName);
        System.out.println("Transient password: " + demo.temporaryPassword);
        System.out.println("strictfp ensures consistent floating-point behavior across platforms.");
    }
}
