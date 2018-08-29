package fourth;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by expert on 7/17/18.
 */
public class Treemap {
    public static void main(String[] args) {

        TreeMap<Integer,String> n=new TreeMap<>();
        n.put(1,"Djbabu");
        n.put(9,"Madhi");
        n.put(0,"krish");

        for (Map.Entry<Integer,String>obj:n.entrySet()){
            System.out.println(obj.getKey());
            System.out.println(obj.getValue());
        }
    }
}
