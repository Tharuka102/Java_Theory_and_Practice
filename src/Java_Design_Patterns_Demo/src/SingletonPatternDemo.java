package Java_Design_Patterns_Demo.src;

class AppConfig {
    // Create a single shared instance eagerly.
    private static final AppConfig INSTANCE = new AppConfig();

    private String appName;

    // Private constructor prevents object creation from outside.
    private AppConfig() {
        appName = "Training App";
    }

    // Global access point to the only object.
    public static AppConfig getInstance() {
        return INSTANCE;
    }

    public String getAppName() {
        return appName;
    }
}

public class SingletonPatternDemo {

    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        System.out.println("App name = " + config1.getAppName());
        System.out.println("Same object? " + (config1 == config2));
    }
}
