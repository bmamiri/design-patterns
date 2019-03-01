package structural.decorator;

import java.util.Arrays;

public abstract class Render {
    private Attribute[] attributes;

    public Render() {
    }

    public Render(Attribute... attributes) {
        this.attributes = attributes;
    }

    public Attribute[] getAttributes() {
        return Arrays.copyOf(attributes, attributes.length);
    }

    protected String writeAttributes(Attribute... attributes) {
        String result = "";
        if (attributes != null) {
            result = Arrays.stream(attributes)
                    .filter(attr -> attr.getValue() != null && attr.getName() != null)
                    .map(attr -> attr.getName() + "='" + attr.getValue() + "' ")
                    .reduce("", String::concat);
        }

        return result;
    }

    protected String writeAttributesAsStyle(Attribute... attributes) {
        String result = "";
        if (attributes != null) {
            result = Arrays.stream(attributes)
                    .filter(attr -> attr.getValue() != null && attr.getName() != null)
                    .map(attr -> attr.getName() + ":" + attr.getValue() + ";")
                    .reduce("", String::concat);
        }

        return result;
    }

    public abstract String write();
}
