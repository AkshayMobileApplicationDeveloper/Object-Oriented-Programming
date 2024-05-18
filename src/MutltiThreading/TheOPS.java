package MutltiThreading;

public class TheOPS {
    public static void main(String[] args) {
        System.out.println("Program start..");
        int x=45+34;
        System.out.println("Add is "+x);

        Thread thread= Thread.currentThread();
        String ThreadName= thread.getName();
        System.out.println("Current Running Thread "+ThreadName);



        thread.setName("MyNewThread");
        System.out.println("New Thread : "+thread.getName());


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        userThread thread1=new userThread();
        thread1.start();

        System.out.println("Program end.....");


    }
}


class userThread extends Thread{
    public void run(){
        System.out.println("This is usser define Thread...");
    }
}
