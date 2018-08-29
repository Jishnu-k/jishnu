package thirdweek;

import java.util.HashSet;

/**
 * Created by expert on 7/12/18.
 */
public class Hastseteg {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();

        set.add("Jishnu");
        set.add("Y");
        set.add("Y");
        set.add(null);
        for(String obj:set){
            System.out.println(obj);
        }
    }
}
