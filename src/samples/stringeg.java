package samples;

/**
 * Created by expert on 6/29/18.
 */
public class stringeg {
    public static void main(String[] args) {

        String s="hello"; //string literals
        String obj=new String("hello world"); //new keyword
        String s1="hello";
        s=s.concat("world");
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(6));
        System.out.println(s.charAt(1));

        String j1="hello";
        String j2="haclo";
        boolean b=j2.equals(j1);
        System.out.println(b);
        System.out.println(j1.compareTo(j2));



    }
}
