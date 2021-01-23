package pl.sdacademy.java.krk27.wpj.behawioralne.mediator;

import java.text.MessageFormat;

public class ChatEchoBot extends ChatMember {
    public ChatEchoBot(String name) {
        super(name);
    }

    @Override
    public void receive(String from, String message, boolean isPrivate) {
        if(isPrivate)
        {
            send(from, message);
        }
        else
        {
            send(message);
        }
    }
}
