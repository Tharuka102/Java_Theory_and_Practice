package Generics_Demo.src;

class Box<T> {
    private T value; // T represents a generic type.

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericClassDemo {

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(100);

        System.out.println("String value = " + stringBox.getValue());
        System.out.println("Integer value = " + integerBox.getValue());
    }
}
