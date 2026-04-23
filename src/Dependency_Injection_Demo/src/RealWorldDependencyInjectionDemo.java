package Dependency_Injection_Demo.src;

// Abstraction for notification sending.
interface NotificationService {
    void notifyUser(String message);
}

// SMS implementation of the notification service.
class SmsNotificationService implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("SMS notification: " + message);
    }
}

// Email implementation of the notification service.
class MailNotificationService implements NotificationService {
    @Override
    public void notifyUser(String message) {
        System.out.println("Email notification: " + message);
    }
}

// Service class depends only on the interface.
class UserRegistrationService {
    private NotificationService notificationService;

    // Constructor injection allows different implementations.
    public UserRegistrationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String userName) {
        System.out.println(userName + " registered successfully.");
        notificationService.notifyUser("Welcome, " + userName + "!");
    }
}

public class RealWorldDependencyInjectionDemo {

    public static void main(String[] args) {
        UserRegistrationService smsService = new UserRegistrationService(new SmsNotificationService());
        smsService.registerUser("Akash");

        System.out.println();

        UserRegistrationService emailService = new UserRegistrationService(new MailNotificationService());
        emailService.registerUser("Nimal");
    }
}
