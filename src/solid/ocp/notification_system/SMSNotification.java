package solid.ocp.notification_system;

public class SMSNotification extends Notification {

    private String notifMessage;
    private int notifId;

    SMSNotification(String notifMessage, int notifId){
        this.notifId = notifId;
        this.notifMessage = notifMessage;
    }
    @Override
    public void createNotification() {
        // Start Custom Notfication for SMS
    }

    @Override
    public void sendNotification(String message) {
        // Send the custom notification to SMS
    }

}
