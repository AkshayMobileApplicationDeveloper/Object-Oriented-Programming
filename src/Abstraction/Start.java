package Abstraction;

public class Start {
    public static void main(String[] args) {
        Mychild mychild=new Mychild();
        mychild.cal();
        mychild.lunchRocket();


        System.out.println();


        MyClass aClass=new Mychild();
        aClass.cal();
        aClass.lunchRocket();
    }

}
