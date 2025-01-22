package o_design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    String channelName;
    List<Subscriber> observers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        observers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        observers.remove(subscriber);
    }
    public void notifySubscribers() {
        for (Subscriber subscriber : observers) {
            subscriber.update(this);
        }
    }



}
