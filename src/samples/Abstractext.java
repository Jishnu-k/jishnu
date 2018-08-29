package samples;

/**
 * Created by expert on 7/6/18.
 */
public class Abstractext extends Abstracteg{

    @Override
    public void add(int x, int y) {
        int sum=x+y;
        System.out.println(sum);
    }

    @Override
    public String showmessage(String message) {
        return message;
    }

    public static void main(String[] args) {

        Abstractext obj=new Abstractext();
        obj.add(2,3);
        obj.display();

        //another method
        //Abstacteg e=new Abstracteg(); -> not possible
        //abstract classes does not have constructor

        Abstracteg e=new Abstractext();
        System.out.println(e.showmessage("hello"));
        e.display();
    }
}
