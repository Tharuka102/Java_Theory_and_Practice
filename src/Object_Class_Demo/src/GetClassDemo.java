package Object_Class_Demo.src;

class AnimalInfo {
}

public class GetClassDemo {

    public static void main(String[] args) {
        AnimalInfo animal = new AnimalInfo();

        // getClass returns runtime class information.
        System.out.println("Class name: " + animal.getClass().getName());
        System.out.println("Simple name: " + animal.getClass().getSimpleName());
    }
}
