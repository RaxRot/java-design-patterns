package com.raxrot.creationaldesignpatterns.abstractfactory;

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        switch (color) {
            case "Red":
                return new Red();
            case "Blue":
                return new Blue();
            case "Green":
                return new Green();
            default:
                return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}

class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        switch (shape) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
