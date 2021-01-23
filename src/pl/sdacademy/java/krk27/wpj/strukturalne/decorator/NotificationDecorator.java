package pl.sdacademy.java.krk27.wpj.strukturalne.decorator;

public abstract class NotificationDecorator implements INotification {

    private INotification notification;

    public NotificationDecorator(INotification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);
        decoratorSend(message);
    }

    protected abstract void decoratorSend(String message);
}
