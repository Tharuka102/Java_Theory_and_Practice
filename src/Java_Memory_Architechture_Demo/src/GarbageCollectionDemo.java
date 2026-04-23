package Java_Memory_Architechture_Demo.src;

public class GarbageCollectionDemo {

    String objectName;

    GarbageCollectionDemo(String objectName) {
        this.objectName = objectName;
    }

    public static void main(String[] args) {
        // Objects are created in heap memory.
        GarbageCollectionDemo first = new GarbageCollectionDemo("Object-1");
        GarbageCollectionDemo second = new GarbageCollectionDemo("Object-2");

        System.out.println(first.objectName);
        System.out.println(second.objectName);

        // Remove references so objects become eligible for garbage collection.
        first = null;
        second = null;

        // Request garbage collection. This is only a suggestion to the JVM.
        System.gc();

        System.out.println("Objects are now eligible for garbage collection.");
    }
}
