package design_patterns.factory.notification;

public class Sms implements Notification{
    @Override
    public void send() {
        System.out.println("send sms notification");
    }
}
