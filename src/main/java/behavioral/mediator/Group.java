package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Group extends SenderReceiver {
    private List<Client> clientList = new ArrayList<>();

    public Group(MessageDelivery messageDelivery, String name) {
        super(messageDelivery, name);
    }

    public List<Client> getClientList() {
        return clientList;
    }

    @Override
    public void sendMessage(String clientName, String message) {
        clientList.forEach(client -> messageDelivery.broadcast(this, client.getName(), message));
    }
}
