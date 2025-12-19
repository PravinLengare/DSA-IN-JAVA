package OOPs.EcommerceOrderSystem;

public class EmailNotification implements NotificationService{
    @Override
    public String sendNotification(String message) {
        return message;
    }

    @Override
    public String toString() {
        return "EmailNotification{}";
    }
}
