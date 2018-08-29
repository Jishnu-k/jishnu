package fifth;

public class Samplethread {

    public void display(int x) {

        // synchronized public void display(int x){ //start thread-2 execution only after thread-1

        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                System.out.println(i * x);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}