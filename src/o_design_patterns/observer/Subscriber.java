package o_design_patterns.observer;


public class Subscriber {
    String subscriberName;
    Channel channel;


    public void update(Channel c){
        System.out.println(c.channelName + " uploaded a video");
    }

    public void subscribe(Channel c){
        channel = c;
    }
}
