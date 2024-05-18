package Interfaces;

import Inheritance.Demo;

public interface Shape {
    int i=45;

    public abstract void calculated(int r);
}

class Circle implements Shape{
    @Override
    public void calculated(int R) {
        System.out.println("Area of the circle "+(Math.PI*R*R));
    }



}


