package thirdweek;

import java.util.LinkedHashSet;

/**
 * Created by expert on 7/12/18.
 */
public class Linkedhashset {

    public static void main(String[] args) {

        LinkedHashSet<String> setex=new LinkedHashSet<>();


        setex.add(null);
        setex.add("Here's the one & only");
        setex.add("SHOW TEAM");
        setex.add("Jishnu");
        setex.add("Y");
        setex.add("Y");

        for (String ob: setex){
            System.out.println(ob);
        }
    }
}
