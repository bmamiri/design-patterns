package behavioral.command;

import behavioral.command.command.Command;

public class ServerCommandInvoker {
    private final Command command;

    public ServerCommandInvoker(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}
