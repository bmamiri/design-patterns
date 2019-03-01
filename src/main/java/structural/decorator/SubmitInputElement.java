package structural.decorator;

import java.util.Arrays;

public class SubmitInputElement extends Render {

    public SubmitInputElement() {
    }

    public SubmitInputElement(Attribute... attributes) {
        super(attributes);
    }

    @Override
    public String write() {
        return "<input type='submit' " +
                writeAttributes(getAttributes()) +
                "/>";
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
}
