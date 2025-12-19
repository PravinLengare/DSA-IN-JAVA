package OOPs.EcommerceOrderSystem;

public class SMSNotification implements NotificationService{
    @Override
    public String sendNotification(String message) {
        return message;
    }

    @Override
    public String toString() {
        return "SMSNotification{}";
    }
}
