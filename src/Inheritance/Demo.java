package Inheritance;

public class Demo {

    public Demo(){
        System.out.println("Demo is creating for this");
    }
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eating();
        dog.speak();

    }
}
