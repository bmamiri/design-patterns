package behavioral.command.receiver;

public class EuropeServer implements ServerAgent {
    @Override
    public void connect() {
        System.out.println("Europe Server connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Europe Server disconnect");
    }

    @Override
    public void shutdown() {
        System.out.println("Europe Server shutdown");
    }

    @Override
    public void reboot() {
        System.out.println("Europe Server reboot");
    }
}
