package behavioral.command.receiver;

public class AsiaServer implements ServerAgent {
    @Override
    public void connect() {
        System.out.println("Asia Server connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Asia Server disconnect");
    }

    @Override
    public void shutdown() {
        System.out.println("Asia Server shutdown");
    }

    @Override
    public void reboot() {
        System.out.println("Asia Server reboot");
    }
}
