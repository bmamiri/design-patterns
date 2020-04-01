package behavioral.command.command;

import behavioral.command.receiver.ServerAgent;

public abstract class Command {
    protected final ServerAgent receiver;

    public Command(ServerAgent receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
