package creational.factorymethod.impl;

import creational.factorymethod.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
