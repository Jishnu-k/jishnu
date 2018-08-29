package samples;

/**
 * Created by expert on 7/5/18.
 */
public class Accesseg1 {

    public int o=4;
    private String name="ashok";

    public void setname(String name){

        this.name=name;
        System.out.println(name);
    }

    public String getname(){

        return name;
    }

    public void display(){

        System.out.println(o);
    }
    public static void main(String[] args) {

        Accesseg1 a=new Accesseg1();
        a.display();

    }
}
