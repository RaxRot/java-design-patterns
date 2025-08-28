package com.raxrot.creationaldesignpatterns.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choise) {
        switch (choise) {
            case "Shape":
                return new ShapeFactory();
            case "Color":
                return new ColorFactory();
                default:
                    return null;
        }
    }
}
