package samples;

/**
 * Created by expert on 7/6/18.
 */
public class Finalover extends Finalex { //final class can't extend

   // @Override //its impossible because final method can't override
    //void display(){
        //System.out.println("override");


    public static void main(String[] args) {
        Finalover fo=new Finalover();
        fo.display();
    }
}
