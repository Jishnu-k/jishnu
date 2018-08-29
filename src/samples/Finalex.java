package samples;

/**
 * Created by expert on 7/6/18.
 */
public class Finalex {

    final int i=10;
    static final int k;
    static {
        k=17;
    }

    final void display(){
        System.out.println("final function");
    }

    public static void main(String[] args) {
        Finalex in = new Finalex();

        //in.i=11;  -> its impossible because i is final

        System.out.println(in.i);
        System.out.println(in.k);
    }
}
