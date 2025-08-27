package com.raxrot.creationaldesignpatterns.factory;

public class ShapeFactoryV1 {
    public Shape getShape(String shapeType) {
        Shape shape=null;
        switch(shapeType){
            case "Circle":
                shape=new Circle();
                break;
                case "Rectangle":
                    shape=new Rectangle();
                    break;
                    case "Square":
                        shape=new Square();
                        break;
                        default:
                            shape=null;
                            break;
        }
        return shape;
    }
}
