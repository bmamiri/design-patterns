package creational.factorymethod;

import creational.factorymethod.impl.Rectangle;
import creational.factorymethod.impl.Square;

import java.text.MessageFormat;

public class ShapeFactory {

    public Shape getShapeInstance(Shape.Type type) {
        Shape shape = null;
        switch (type) {
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            default:
                throw new IllegalStateException(MessageFormat.format("Shape type {0}, not implemented yet", type.name()));
        }

        return shape;
    }
}
