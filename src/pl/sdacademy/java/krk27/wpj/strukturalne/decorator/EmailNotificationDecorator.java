package pl.sdacademy.java.krk27.wpj.strukturalne.decorator;

public class EmailNotificationDecorator extends NotificationDecorator {
    public EmailNotificationDecorator(INotification notification) {
        super(notification);
    }

    @Override
    protected void decoratorSend(String message) {
        System.out.printf("Email: %s\n", message);
    }
}
