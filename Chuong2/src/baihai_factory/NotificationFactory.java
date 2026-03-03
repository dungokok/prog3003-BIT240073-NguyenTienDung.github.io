package baihai_factory;

public class NotificationFactory {
    public static Notification createNotification(String channel) {
        if (channel == null) return null;

        switch (channel.toUpperCase()) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel: " + channel);
        }
    }
}
