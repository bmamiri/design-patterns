package behavioral.chainofresponsibility.handler;

import behavioral.chainofresponsibility.Message;

public class SmsMessageHandler extends MessageHandler {
    public SmsMessageHandler(MessageHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.SMS)) {
            System.out.printf("Message sent to: %s via SMS",
                    message.getDestinationMap().get(Message.Destination.SMS));
            System.out.println();
        }
        if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}
