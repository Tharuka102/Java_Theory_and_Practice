package Java_Design_Patterns_Demo.src;

interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending an email notification");
    }
}

class SmsNotification implements Notification {
    public void send() {
        System.out.println("Sending an SMS notification");
    }
}

class NotificationFactory {
    // Factory method creates the required object based on input.
    public static Notification createNotification(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SmsNotification();
        }
        return null;
    }
}

public class FactoryPatternDemo {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("email");

        if (notification != null) {
            notification.send();
        }
    }
}
