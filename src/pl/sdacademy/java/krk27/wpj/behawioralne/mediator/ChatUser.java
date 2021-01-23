package pl.sdacademy.java.krk27.wpj.behawioralne.mediator;

import java.text.MessageFormat;

public class ChatUser extends ChatMember {
    public ChatUser(String name) {
        super(name);
    }

    @Override
    public void receive(String from, String message, boolean isPrivate) {
        if(isPrivate)
            System.out.println(MessageFormat.format("{0} to {1}: {2}", from, getName(), message));
        else
            System.out.println(MessageFormat.format("{0}: {1}", from, message));
    }
}
