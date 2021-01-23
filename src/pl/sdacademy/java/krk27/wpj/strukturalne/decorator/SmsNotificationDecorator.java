package pl.sdacademy.java.krk27.wpj.strukturalne.decorator;

public class SmsNotificationDecorator extends NotificationDecorator {
    public SmsNotificationDecorator(INotification notification) {
        super(notification);
    }

    @Override
    protected void decoratorSend(String message) {
        System.out.printf("SMS: %s\n", message);
    }
}
