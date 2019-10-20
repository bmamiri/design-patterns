package behavioral.chainofresponsibility;

import java.util.EnumMap;
import java.util.Map;

public class Message {
    private String value;
    private Map<Destination, String> destinationMap;

    public Message(String value, Map<Destination, String> destinationMap) {
        this.value = value;
        this.destinationMap = destinationMap;
    }

    public static MessageBuilder getBuilder() {
        return new MessageBuilder();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Map<Destination, String> getDestinationMap() {
        return destinationMap;
    }

    public void setDestinationMap(Map<Destination, String> destinationMap) {
        this.destinationMap = destinationMap;
    }

    public enum Destination {
        SMS, EMAIL, FAX
    }

    public static class MessageBuilder {
        private String value;
        private Map<Destination, String> destinationMap = new EnumMap<>(Destination.class);

        public MessageBuilder setValue(String value) {
            this.value = value;
            return this;
        }

        public MessageBuilder addDestination(Destination destination, String value) {
            destinationMap.put(destination, value);
            return this;
        }

        public Message createMessage() {
            return new Message(value, destinationMap);
        }
    }
}
