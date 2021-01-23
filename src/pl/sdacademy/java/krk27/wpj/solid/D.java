package pl.sdacademy.java.krk27.wpj.solid;

import java.util.List;

public class D {

    interface IMessage {
        void sendMessage();
    }

    class SMS implements IMessage
    {
        String number;
        String content;

        public void sendSMS()
        {
            System.out.println("Sending SMS...");
        }

        @Override
        public void sendMessage() {
            sendSMS();
        }
    }

    class MMS implements IMessage
    {
        String number;
        public byte[] content;

        public void sendMMS()
        {
            System.out.println("Sending MMS...");
        }

        @Override
        public void sendMessage() {
            sendMMS();
        }
    }

    class Mail implements IMessage
    {
        String address;
        String subject;
        String content;

        public void sendMail()
        {
            System.out.println("Sending Mail...");
        }

        @Override
        public void sendMessage() {
            sendMail();
        }
    }

    class Messenger
    {
        List<IMessage> messages;

        public Messenger(List<IMessage> messages) {
            this.messages = messages;
        }

        public void setMessages(List<IMessage> messages) {
            this.messages = messages;
        }

        public void sendMessage()
        {
            for (IMessage message : messages) {
                message.sendMessage();
            }
        }
    }
}
