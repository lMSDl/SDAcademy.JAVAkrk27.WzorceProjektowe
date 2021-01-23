package pl.sdacademy.java.krk27.wpj.behawioralne.command;

import java.util.Stack;

public class Invoker {

    private static Stack<ICommand> commands = new Stack<>();
    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void invoke() {
        if(command.execute())
            commands.push(command);
    }

    public static void undo() {
        commands.pop().undo();
    }
}
