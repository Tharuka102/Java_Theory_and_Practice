package JDK_JRE_JVM_Demo.src;

public class SystemPropertiesDemo {

    public static void main(String[] args) {
        // These properties come from the Java runtime environment.
        System.out.println("Java version   : " + System.getProperty("java.version"));
        System.out.println("Java vendor    : " + System.getProperty("java.vendor"));
        System.out.println("Java home      : " + System.getProperty("java.home"));
        System.out.println("OS name        : " + System.getProperty("os.name"));
    }
}
