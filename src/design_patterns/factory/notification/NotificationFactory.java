package design_patterns.factory.notification;

public class NotificationFactory {
    public Notification createNotification(NotificationCategory n){
        return switch (n) {
            case EMAIL -> new Email();
            case PUSH -> new Push();
            case SMS -> new Sms();
            default -> throw new IllegalArgumentException("Unknown notification type: " + n);
        };
    }
}
