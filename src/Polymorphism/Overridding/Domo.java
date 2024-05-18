package Polymorphism.Overridding;

public class Domo {//Run time Polymore

    public static void main(String[] args) {
        //Overridding overridding=new Employee();

        Overridding overridding=new Shayam();

        Ram ram=new Ram();
        ram.dowork(overridding);
    }

}
