package com.raxrot.principleasandstrategies;

public class DelegationPriciple {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}

class RealPrinter{
    void print(){
        System.out.println("The delegate");
    }
}

class Printer{
    RealPrinter printer = new RealPrinter();
    void print(){
        printer.print();
    }
}


