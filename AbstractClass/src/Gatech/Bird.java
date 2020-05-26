package Gatech;

import java.util.stream.DoubleStream;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is picking");
    }

    @Override
    public void breathe() {
        System.out.println(super.getName() + " is breathing.");
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " is flapping its wings.");
    }
}
