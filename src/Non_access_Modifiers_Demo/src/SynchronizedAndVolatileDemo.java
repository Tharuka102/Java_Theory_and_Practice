package Non_access_Modifiers_Demo.src;

public class SynchronizedAndVolatileDemo {

    // Volatile ensures the latest value is visible across threads.
    private volatile boolean running = true;

    // Synchronized method allows only one thread at a time to enter it.
    public synchronized void printSafeMessage(String message) {
        System.out.println("Thread-safe message: " + message);
    }

    public void stopRunning() {
        running = false;
    }

    public void showStatus() {
        System.out.println("Running status: " + running);
    }

    public static void main(String[] args) {
        SynchronizedAndVolatileDemo demo = new SynchronizedAndVolatileDemo();
        demo.printSafeMessage("Java synchronization example");
        demo.showStatus();
        demo.stopRunning();
        demo.showStatus();
    }
}
