package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.service.MessageService;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Message message = Message.getBuilder().setValue("Hi, New Message")
                .addDestination(Message.Destination.SMS, "1234567890")
                .addDestination(Message.Destination.FAX, "1234567890")
                .addDestination(Message.Destination.EMAIL, "a@b.com")
                .createMessage();

        MessageService messageService = new MessageService();
        messageService.sendMessage(message);
    }
}