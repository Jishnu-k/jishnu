package thirdweek;

/**
 * Created by expert on 7/9/18.
 */
public class Typecastex {

    public static void main(String[] args) {

        byte b=10;
        int x=b;
        int z=98;
        float f=z;
        float f1=10.0f;
        int y=(int)f1; //explicit type casting or down casting
        byte by=(byte)z;
        System.out.println(f);
        System.out.println(x);
        System.out.println(y);
        System.out.println(by);
        boolean b1=true;
        Integer i=Integer.valueOf(x); //auto boxing
        Boolean obj=Boolean.valueOf(b1);

        Boolean b2=new Boolean(obj); //unboxing
        System.out.println(b2);
        // Float fx;
        // Double d;
        // Byte bb;
        // Long l1;
        System.out.println(obj);

        String s="123";
        Integer intv=Integer.parseInt(s);
        System.out.println(intv);

        //String n="abc"; //can't assign to int
        //Integer inty=Integer.parseInt(n);
        //System.out.println(inty);

        Float ff=Float.parseFloat(s);
        System.out.println(ff);
    }
}
