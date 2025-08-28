package com.raxrot.creationaldesignpatterns.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();

        Color color = colorFactory.getColor("Red");
        color.fill();

    }
}
