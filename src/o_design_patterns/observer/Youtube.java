package o_design_patterns.observer;

public class Youtube {
    public static void main(String[] args) {
        Channel channel = new Channel();
        channel.channelName = "9anat Yotip hh";

        Subscriber subscriber = new Subscriber();
        subscriber.channel = channel;
        subscriber.subscriberName = "Messi";
        Subscriber subscriber2 = new Subscriber();
        subscriber2.channel = channel;
        subscriber2.subscriberName = "Messi2";
        Subscriber subscriber3 = new Subscriber();
        subscriber3.channel = channel;
        subscriber3.subscriberName = "Messi3";
        Subscriber subscriber4 = new Subscriber();
        subscriber4.channel = channel;
        subscriber4.subscriberName = "Messi4";
        channel.subscribe(subscriber);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);
        channel.subscribe(subscriber4);
        channel.unsubscribe(subscriber);
        channel.notifySubscribers();

    }
}
