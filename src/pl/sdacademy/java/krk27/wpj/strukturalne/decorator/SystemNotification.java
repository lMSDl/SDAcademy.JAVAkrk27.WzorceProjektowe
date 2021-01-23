package pl.sdacademy.java.krk27.wpj.strukturalne.decorator;

public class SystemNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.printf("System:%s\n", message);
    }
}
