package design_patterns.factory.notification;

public class Email implements Notification {
    @Override
    public void send() {
        System.out.println("send email notification");
    }
}
