package samples;

/**
 * Created by expert on 7/6/18.
 */
public class Interfaceeg implements Sampleinterface {

    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }

    @Override
    public void display() {
        System.out.println("Rohith Roy is my best friend.");
    }

    public static void main(String[] args) {

        Interfaceeg in=new Interfaceeg();
        in.add(4,1);
        in.display();

    }
}
