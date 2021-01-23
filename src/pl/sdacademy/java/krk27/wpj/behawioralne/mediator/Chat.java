package pl.sdacademy.java.krk27.wpj.behawioralne.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Chat implements IChatMediator {

    private List<IElement> members = new ArrayList<>();

    @Override
    public void join(IElement element) {
        if(!members.contains(element))
            members.add(element);
    }

    @Override
    public void quit(IElement element) {
        members.remove(element);
    }

    @Override
    public void send(IElement from, String to, String message) {
        Optional<IElement> member = members.stream().filter(x -> x.getName().equals(to)).findFirst();
        if(member.isPresent())
            member.get().receive(from.getName(), message, true);
    }

    @Override
    public void send(IElement from, String message) {
        var query = members.stream();
        if (from instanceof ChatEchoBot)
            query = query.filter(x -> !(x instanceof ChatEchoBot));
        query.forEach(x -> x.receive(from.getName(), message, false));
    }
}
