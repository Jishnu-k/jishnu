package fifth;

/**
 * Created by expert on 7/23/18.
 */
public class ThreadEx extends Thread {

    @Override
    public void run(){
        System.out.println("Thread in execution");
    }

    public static void main(String[] args) {

        ThreadEx t1=new ThreadEx();
        t1.start();

        ThreadEx t2=new ThreadEx();
        t2.start();

        System.out.println("Main Thread");
    }
}
