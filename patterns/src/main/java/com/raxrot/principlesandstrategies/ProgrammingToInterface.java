package com.raxrot.principlesandstrategies;

public class ProgrammingToInterface {
    public static void main(String[] args) {
        Computer computer = new Computer();
        displayModule monitor=new Monitor();
        displayModule projector=new Projector();
        computer.setDisplayModule(monitor);
        computer.display();

        computer.setDisplayModule(projector);
        computer.display();
    }
}

interface displayModule {
    void display();
}

class Monitor implements displayModule {

    @Override
    public void display() {
        System.out.println("Monitor");
    }
}

class Projector implements displayModule {

    @Override
    public void display() {
        System.out.println("Projector");
    }
}

class Computer {
    displayModule dm;
    public void setDisplayModule(displayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }
}


