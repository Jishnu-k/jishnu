package samples;

/**
 * Created by expert on 6/28/18.
 */
public class inc {

    public static void main(String[] args) {

        int a=3;
        int b=3;
        int f=a++;

        int p=++b;

        System.out.println("postfix is "+f+ " and f++ is " +a);
        System.out.println("prefix is "+p);

        if((a!=f)&&(p!=++b))
            System.out.println("jishnu is right");
    }
}
