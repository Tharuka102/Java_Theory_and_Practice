package Types_Of_Interfaces_Demo.src;

class OuterDevice {

    interface Switchable {
        void turnOn();
    }
}

class Fan implements OuterDevice.Switchable {
    public void turnOn() {
        System.out.println("Fan is now ON");
    }
}

public class NestedInterfaceDemo {

    public static void main(String[] args) {
        OuterDevice.Switchable device = new Fan();
        device.turnOn();
    }
}
