package Abstraction_Demo.src;

// First interface for camera behavior.
interface Camera {
    void takePhoto();
}

// Second interface for music player behavior.
interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    // Implement camera feature.
    @Override
    public void takePhoto() {
        System.out.println("Photo captured successfully.");
    }

    // Implement music feature.
    @Override
    public void playMusic() {
        System.out.println("Playing music now.");
    }
}

public class MultipleAbstractionDemo {

    public static void main(String[] args) {
        // SmartPhone supports multiple interface-based abstractions.
        SmartPhone phone = new SmartPhone();
        phone.takePhoto();
        phone.playMusic();
    }
}
