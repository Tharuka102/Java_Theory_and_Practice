package Dependency_Injection_Demo.src;

// This class is tightly coupled because it creates its own dependency internally.
class TightKeyboard {
    public void type() {
        System.out.println("Typing using a built-in keyboard.");
    }
}

class TightlyCoupledComputer {
    private TightKeyboard keyboard = new TightKeyboard();

    public void start() {
        keyboard.type();
        System.out.println("Tightly coupled computer started.");
    }
}

// Interface creates loose coupling.
interface Keyboard {
    void type();
}

class MechanicalKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing using a mechanical keyboard.");
    }
}

class LooselyCoupledComputer {
    private Keyboard keyboard;

    // Constructor injection creates loose coupling.
    public LooselyCoupledComputer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void start() {
        keyboard.type();
        System.out.println("Loosely coupled computer started.");
    }
}

public class TightVsLooseCouplingDemo {

    public static void main(String[] args) {
        TightlyCoupledComputer computer1 = new TightlyCoupledComputer();
        computer1.start();

        System.out.println();

        LooselyCoupledComputer computer2 = new LooselyCoupledComputer(new MechanicalKeyboard());
        computer2.start();
    }
}
