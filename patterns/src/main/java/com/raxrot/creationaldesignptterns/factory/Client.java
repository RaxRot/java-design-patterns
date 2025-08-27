package com.raxrot.creationaldesignptterns.factory;

public class Client {
    public static void main(String[] args) {
        Shape shape1=new CircleFactory().getShape();
        Shape shape2=new RectangleFactory().getShape();
        Shape shape3=new SquareFactory().getShape();

        shape1.draw();
        shape2.draw();
        shape3.draw();

        System.out.println("----------------");

        ShapeFactoryV1 shapeFactory=new ShapeFactoryV1();
        Shape circle =shapeFactory.getShape("Circle");
        Shape rectangle =shapeFactory.getShape("Rectangle");
        Shape square =shapeFactory.getShape("Square");
        circle.draw();
        rectangle.draw();
        square.draw();


        System.out.println("----------------");
        Shape circle2 =ShapeFactoryV2.getShape("Circle");
        Shape rectangle2 =ShapeFactoryV2.getShape("Rectangle");
        Shape square2 =ShapeFactoryV2.getShape("Square");
        circle2.draw();
        rectangle2.draw();
        square2.draw();
    }
}
