
//Runnable Interface

package MutltiThreading;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("value of the i :" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread=new MyThread();
        Thread thread1=new Thread(thread);
        thread1.start();
    }
}
