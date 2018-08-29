package thirdweek;

/**
 * Created by expert on 7/9/18.
 */
public class Stringex {

    public static void main(String[] args) {
        String s="hi,hello,how,are,you";
        System.out.println(s);
        String[] a=s.split(",");
        Object[] obj={1,"jishnu",10.0f};
        for(int i=0;i<5;i++)
            System.out.println(a[i]);
        for(Object o:obj)
            System.out.println(o);

    }
}
