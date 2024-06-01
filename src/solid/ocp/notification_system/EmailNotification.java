package solid.ocp.notification_system;

public class EmailNotification extends Notification {

    private String notifMessage;
    private int notifId;

    EmailNotification(String notifMessage, int notifId){
        this.notifId = notifId;
        this.notifMessage = notifMessage;
    }
    @Override
    public void createNotification() {
        // Start Custom Notfication for Email
    }

    @Override
    public void sendNotification(String message) {
        // Send the custom notification to email
    }

}
