package design_patterns.factory.notification;

public class MainTest {
    public static void main(String[] args) {

        NotificationFactory notifyAdapter = new NotificationFactory();

        Notification nSms = notifyAdapter.createNotification(NotificationCategory.SMS);
        nSms.send();

        Notification nEmail = notifyAdapter.createNotification(NotificationCategory.EMAIL);
        nEmail.send();

        Notification nPush = notifyAdapter.createNotification(NotificationCategory.PUSH);
        nPush.send();
    }
}
