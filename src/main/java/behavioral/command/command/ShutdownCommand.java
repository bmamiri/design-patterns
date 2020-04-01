package behavioral.command.command;

import behavioral.command.receiver.ServerAgent;

public class ShutdownCommand extends Command {
    public ShutdownCommand(ServerAgent receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.shutdown();
        receiver.disconnect();
    }
}
