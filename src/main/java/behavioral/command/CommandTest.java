package behavioral.command;

import behavioral.command.command.Command;
import behavioral.command.command.ShutdownCommand;
import behavioral.command.receiver.AsiaServer;
import behavioral.command.receiver.ServerAgent;

public class CommandTest {
    public static void main(String[] args) {
        ServerAgent serverAgent = new AsiaServer();
        Command shutdownCommand = new ShutdownCommand(serverAgent);
        ServerCommandInvoker invoker = new ServerCommandInvoker(shutdownCommand);
        invoker.run();
    }
}
