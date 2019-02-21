package creational.factorymethod;

import creational.factorymethod.impl.Rectangle;
import creational.factorymethod.impl.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeFactoryTest {
    @Test
    void getShapeInstance() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape squareShapeInstance = shapeFactory.getShapeInstance(Shape.Type.SQUARE);
        assertTrue(squareShapeInstance instanceof Square);
        Shape rectangleShapeInstance = shapeFactory.getShapeInstance(Shape.Type.RECTANGLE);
        assertTrue(rectangleShapeInstance instanceof Rectangle);
    }
}