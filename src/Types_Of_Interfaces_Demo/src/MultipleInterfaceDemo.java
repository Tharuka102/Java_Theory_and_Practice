package Types_Of_Interfaces_Demo.src;

interface Camera {
    void capture();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    public void capture() {
        System.out.println("Capturing photo...");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }
}

public class MultipleInterfaceDemo {

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.capture();
        phone.playMusic();
    }
}
