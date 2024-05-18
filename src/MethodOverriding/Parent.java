package MethodOverriding;

public class Parent {

    //Method overridden
    public void methodProperty(){
        System.out.println("I am MP() of the Parent");
    }
}

class child extends Parent{

    //override Method
    @Override
    public void methodProperty() {
        System.out.println("I am MP() of the Child");
    }
}


