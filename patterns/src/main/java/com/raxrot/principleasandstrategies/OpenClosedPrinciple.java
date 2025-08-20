package com.raxrot.principleasandstrategies;

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Shape circle = new Circle();
        System.out.println(areaCalculator.calculateArea(circle));

        Shape rectangle = new Rectangle();
        System.out.println(areaCalculator.calculateArea(rectangle));
    }
}
interface Shape{
    double calculateArea();
}
class Rectangle implements Shape{
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}


class Circle implements Shape{
    public double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class AreaCalculator{
    public double calculateArea(Shape shape){
        return shape.calculateArea();
    }
}
