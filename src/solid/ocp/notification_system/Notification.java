package solid.ocp.notification_system;

abstract class Notification {
    public abstract void createNotification();
    public abstract void sendNotification(String message);
}


