package samples;

/**
 * Created by expert on 7/3/18.
 */
public class Binh extends Ainh {

    int d=1;
    int e=2;
    public Binh() {

        System.out.println("child constructor");
    }

    @Override
    public void display(){
        System.out.println("child hello");
    }


    public static void main(String[] args) {

        Binh obj=new Binh();
        System.out.println("Parent->"+obj.a+","+obj.b);
        System.out.println("Child->"+obj.d+","+obj.e);
        obj.display();
    }
}
