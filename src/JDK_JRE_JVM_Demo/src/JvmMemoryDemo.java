package JDK_JRE_JVM_Demo.src;

public class JvmMemoryDemo {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // Runtime object allows us to inspect memory information from the JVM.
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();

        System.out.println("Total memory = " + totalMemory);
        System.out.println("Free memory  = " + freeMemory);
        System.out.println("Max memory   = " + maxMemory);
    }
}
