package com.raxrot.creationaldesignpatterns.factory;

public class ShapeFactoryV2 {
    public static Shape getShape(String shapeName) {
        switch (shapeName) {
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
