package fifth;

/**
 * Created by expert on 7/23/18.
 */
public class RunnableEx implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread in execution");
        System.out.println(i);
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        }
    }



    public static void main(String[] args) {

        RunnableEx obj=new RunnableEx();
        Thread t1=new Thread(obj);
        t1.setName("Thread1");
        t1.start();
        Thread t2=new Thread(obj);
        t2.setName("Thread2");
        t2.start();
        System.out.println("Main Thread");
    }
}
