package behavioral.command.command;

import behavioral.command.receiver.ServerAgent;

public class RebootCommand extends Command {
    public RebootCommand(ServerAgent receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
        receiver.reboot();
        receiver.disconnect();
    }
}
