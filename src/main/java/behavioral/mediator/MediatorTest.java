package behavioral.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        MessageDelivery messageDelivery = new MessageDelivery();

        Client testClientAlfa = new Client(messageDelivery, "@abc");
        Client testClientBeta = new Client(messageDelivery, "@xyz");
        testClientAlfa.sendMessage("@xyz", "Hi");

        Group goldUserGroup = new Group(messageDelivery, "@admin");
        goldUserGroup.getClientList().add(testClientAlfa);
        goldUserGroup.getClientList().add(testClientBeta);
        goldUserGroup.sendMessage(null, "Hello everyone, welcome to gold user group");
    }
}
