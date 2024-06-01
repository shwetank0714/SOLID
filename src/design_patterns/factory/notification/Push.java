package design_patterns.factory.notification;

public class Push implements Notification{
    @Override
    public void send() {
        System.out.println("send push notification");
    }
}
