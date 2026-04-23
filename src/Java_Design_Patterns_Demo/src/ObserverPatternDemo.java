package Java_Design_Patterns_Demo.src;

import java.util.ArrayList;
import java.util.List;

interface Subscriber {
    void update(String message);
}

class EmailSubscriber implements Subscriber {
    private String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}

class NewsChannel {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}

public class ObserverPatternDemo {

    public static void main(String[] args) {
        NewsChannel newsChannel = new NewsChannel();

        newsChannel.subscribe(new EmailSubscriber("User One"));
        newsChannel.subscribe(new EmailSubscriber("User Two"));

        // All subscribers receive the same update.
        newsChannel.notifySubscribers("New Java lesson available");
    }
}
