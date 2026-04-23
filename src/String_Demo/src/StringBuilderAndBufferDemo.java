package String_Demo.src;

public class StringBuilderAndBufferDemo {

    public static void main(String[] args) {
        // StringBuilder is mutable and faster for single-thread use.
        StringBuilder builder = new StringBuilder("Java");
        builder.append(" Builder");
        builder.append(" Demo");

        System.out.println("StringBuilder result: " + builder);

        // StringBuffer is mutable and synchronized for thread-safe use.
        StringBuffer buffer = new StringBuffer("Java");
        buffer.append(" Buffer");
        buffer.append(" Demo");

        System.out.println("StringBuffer result : " + buffer);
    }
}
