package Inheritance;

public class Dog extends Animal{

    public Dog(){
        super();
        System.out.println("working now");
    }
     int  x=12;
    public void speak(){
        System.out.println("Dog is bracking....");
        System.out.println("Dog Class :"+this.x);
        System.out.println("Animal class variable "+super.x);
    }
}
