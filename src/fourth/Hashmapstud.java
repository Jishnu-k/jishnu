package fourth;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by expert on 7/17/18.
 */
public class Hashmapstud {
    public static void main(String[] args) {

        LinkedHashMap<String,String> obj=new LinkedHashMap<>();
        obj.put("11","aswanth");
        obj.put("33","chithu");
        System.out.println(obj.containsKey("99"));
        System.out.println(obj.containsValue("aswanth"));
        for (Map.Entry<String,String> obj1:obj.entrySet()){
            System.out.println(obj1.getValue());
            System.out.println(obj1.getKey());
        }
    }
}
