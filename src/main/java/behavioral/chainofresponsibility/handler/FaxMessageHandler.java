package behavioral.chainofresponsibility.handler;

import behavioral.chainofresponsibility.Message;

public class FaxMessageHandler extends MessageHandler {
    public FaxMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.FAX)) {
            System.out.printf("Message sent to: %s via Fax",
                    message.getDestinationMap().get(Message.Destination.FAX));
            System.out.println();
        }
        if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}
