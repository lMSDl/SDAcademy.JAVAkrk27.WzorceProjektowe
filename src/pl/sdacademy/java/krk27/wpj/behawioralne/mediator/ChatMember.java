package pl.sdacademy.java.krk27.wpj.behawioralne.mediator;

public abstract class ChatMember implements IElement {

    private String name;
    private IChatMediator chat;

    public ChatMember(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setChat(IChatMediator chat) {
        if(this.chat != null)
            this.chat.quit(this);
        this.chat = chat;
        if(this.chat != null)
            this.chat.join(this);
    }

    public void send(String to, String message) {
        chat.send(this, to, message);
    }
    public void send(String message) {
        chat.send(this, message);
    }

}
