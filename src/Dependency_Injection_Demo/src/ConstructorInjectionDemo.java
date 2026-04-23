package Dependency_Injection_Demo.src;

// Service interface defines the common message behavior.
interface MessageService {
    void sendMessage(String message);
}

// Concrete service implementation sends email messages.
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

// Consumer class depends on the abstraction, not the concrete class directly.
class NotificationApp {
    private MessageService messageService;

    // Constructor injection provides the dependency from outside.
    public NotificationApp(MessageService messageService) {
        this.messageService = messageService;
    }

    // Business method uses the injected service.
    public void process(String message) {
        messageService.sendMessage(message);
    }
}

public class ConstructorInjectionDemo {

    public static void main(String[] args) {
        // Create the dependency object.
        MessageService service = new EmailService();

        // Inject the dependency using the constructor.
        NotificationApp app = new NotificationApp(service);

        // Use the app normally.
        app.process("Welcome to constructor injection.");
    }
}
