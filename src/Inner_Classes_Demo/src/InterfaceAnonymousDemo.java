package Inner_Classes_Demo.src;

interface ButtonClick {
    void onClick();
}

public class InterfaceAnonymousDemo {

    public static void main(String[] args) {
        // Anonymous class implementing an interface.
        ButtonClick button = new ButtonClick() {
            public void onClick() {
                System.out.println("Button clicked using anonymous class");
            }
        };

        button.onClick();
    }
}
