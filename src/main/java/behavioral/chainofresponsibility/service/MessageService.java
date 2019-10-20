package behavioral.chainofresponsibility.service;

import behavioral.chainofresponsibility.Message;
import behavioral.chainofresponsibility.handler.EmailMessageHandler;
import behavioral.chainofresponsibility.handler.FaxMessageHandler;
import behavioral.chainofresponsibility.handler.MessageHandler;
import behavioral.chainofresponsibility.handler.SmsMessageHandler;

public class MessageService {
    public void sendMessage(Message message) {
        MessageHandler nextHandler = null;
        for (Message.Destination destination : message.getDestinationMap().keySet()) {
            switch (destination) {
                case FAX:
                    nextHandler = new FaxMessageHandler(nextHandler);
                    break;
                case SMS:
                    nextHandler = new SmsMessageHandler(nextHandler);
                    break;
                case EMAIL:
                    nextHandler = new EmailMessageHandler(nextHandler);
                    break;
            }
        }
        if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}
