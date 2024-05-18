package MutltiThreading;

public class ThreadClass extends Thread{
    public  void run(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("Value of the i is : "+i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        ThreadClass aClass=new ThreadClass();
        aClass.run();
    }
}
