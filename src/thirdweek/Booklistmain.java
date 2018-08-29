package thirdweek;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by expert on 7/12/18.
 */
public class Booklistmain {
    public static void main(String[] args) {

        Booklist b1 = new Booklist("Verukal", 100, "kurupp");
        Booklist b2 = new Booklist("Love", 1000, "Aswanth");
        Booklist b3 = new Booklist("Psc", 500, "Ashok");
        LinkedList<Booklist> l = new LinkedList<>();
        l.add(b1);
        l.add(b2);
        l.add(b3);

        Iterator itr = l.iterator();

            while (itr.hasNext()) {
                Booklist obj = (Booklist) itr.next();
                System.out.println(obj.name + " " + obj.price + " " + obj.author);
            }

        for (Booklist ob:l){

                if(l.contains(b2)){
                    b2.name="jishnu";
                    System.out.println(ob.name + " " + ob.price + " " + ob.author);
                }

        }
    }
}
