package thirdweek;

import java.util.ArrayList;
import java.util.Iterator;

public class Accholderlist {

    public static void deposit(int no, int dp, ArrayList<Banklist> ab) {

        for (Banklist ob : ab) {
            if (ob.ano == no)
                ob.abal += dp;
        }
    }

    public static void retrieve(int no, int rv, ArrayList<Banklist> ab) {

        for (Banklist ob : ab) {
            if (ob.ano == no)
                ob.abal -= rv;
        }
    }

    public static void close(int no, ArrayList<Banklist> ab) {

        for (Banklist ob : ab) {
            if (ob.ano == no){
                ab.remove(ob);
                break;
            }
        }
    }
    public static void display(ArrayList<Banklist> ab) {

        Iterator it = ab.iterator();
        while(it.hasNext())
        {
            Banklist l = (Banklist) it.next();
            System.out.println(l.name + " " + l.branch + " " + l.ifsc + " " + l.ano + " " + l.aname + " " + l.abal);
        }

    }

    public static void main(String[] args) {

        Banklist b1 = new Banklist("sbi", "tvmala", 1234, 1, "jishnu", 1000);
        Banklist b2 = new Banklist("sbs", "tvmama", 1289, 2, "ashok", 6000);
        Banklist b3 = new Banklist("sis", "tsrmmm", 1290, 3, "aswanth", 9000);

        ArrayList<Banklist> ab = new ArrayList<>();
        ab.add(b1);
        ab.add(b2);
        ab.add(b3);

        deposit(1,500,ab);
        retrieve(3,500,ab);
        close(2,ab);
        display(ab);

    }
}
