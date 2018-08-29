package samples;

/**
 * Created by expert on 7/3/18.
 */
public class Poly {

    public void display(){
        System.out.println("Null display");
    }

    public void display(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Poly p=new Poly();
        String msg="hello";
        p.display(msg);
        p.display();
    }
}
