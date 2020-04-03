package behavioral.mediator;

public class Client extends SenderReceiver {
    public Client(MessageDelivery messageDelivery, String name) {
        super(messageDelivery, name);
    }

    @Override
    public void sendMessage(String clientName, String message) {
        messageDelivery.broadcast(this, clientName, message);
    }
}
