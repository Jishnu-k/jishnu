package thirdweek;

import java.util.TreeSet;

/**
 * Created by expert on 7/12/18.
 */
public class Treesetex {

    public static void main(String[] args) {

        TreeSet<String> ts=new TreeSet<>();
        ts.add("aswanth");
        ts.add("ashok");
        ts.add("rohith");
        ts.add("jishnu");

        for (String obj:
             ts) {
            System.out.println(obj);
        }
    }
}
