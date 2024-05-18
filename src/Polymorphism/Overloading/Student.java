package Polymorphism.Overloading;

public class Student {
    public void read(){
        System.out.println("Student is reading xyz Book");
    }
    public void read(String Book){
        System.out.println("Student is reading " + Book + " Book");
    }

}
