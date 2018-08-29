package fourth;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expert on 7/17/18.
 */
public class Studentmap {

    public static void main(String[] args) {

        HashMap<Integer,String> hmap=new HashMap<>();
        hmap.put(11,"athira");
        hmap.put(null,"aswanth");
        hmap.put(1,"kavya");
        hmap.put(19,"sini");


        for (Map.Entry obj: hmap.entrySet()){
            System.out.println("key:"+obj.getKey()+" "+"value:"+obj.getValue());
        }
    }
}