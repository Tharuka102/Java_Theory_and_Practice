package Generics_Demo.src;

interface Processor<T> {
    void process(T item);
}

class StringProcessor implements Processor<String> {
    public void process(String item) {
        System.out.println("Processing string: " + item.toUpperCase());
    }
}

public class GenericInterfaceDemo {

    public static void main(String[] args) {
        Processor<String> processor = new StringProcessor();
        processor.process("generics demo");
    }
}
