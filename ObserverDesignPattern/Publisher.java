import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers;

    public Publisher() {
        subscribers = new ArrayList<>();
    }

    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unregister(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notify(String news, String type) {
        for (Subscriber subscriber : subscribers) {

            if (subscriber.getType().equals(type)) {
                subscriber.update(news);
            }
        }
    }
}
