package samples;

/**
 * Created by expert on 7/4/18.
 */
public class Staticeg {
    static int i=1; //single memory location
    int j=1;

    Staticeg(){
        ++i;
        ++j;
        System.out.println(i+" "+j);
    }

    public static void display(){
        System.out.println("static function");
    }

     static class Innerstatic{

        public void msg(){
            System.out.println("hello");
        }
        public static void printfun(){
            System.out.println("Static fun of inner class");
        }
    }

    static{
        i=5;
        System.out.println("static block");
    }

    public static void main(String[] args) {
        Staticeg s=new Staticeg();
        Staticeg s1=new Staticeg();
        System.out.println(Staticeg.i+" "+s.j);
        display();
        Innerstatic.printfun();
    }
}
