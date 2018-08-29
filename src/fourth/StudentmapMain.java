package fourth;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expert on 7/17/18.
 */
public class StudentmapMain {
    public static void main(String[] args) {

        HashMap<Integer,StudMap> hmap=new HashMap<>();
        hmap.put(2,new StudMap("alan",11,"h77j0"));
        hmap.put(3,new StudMap("bibin",77,"010p0"));
        hmap.put(4,new StudMap("aswanth",99,"k9j0"));

        for (Map.Entry<Integer,StudMap>obj: hmap.entrySet()){
            System.out.println("rollno:"+obj.getKey());
            System.out.println("Student Details");
            StudMap s=obj.getValue();
            System.out.println("name:"+s.name+" "+"age:"+s.age+" "+"address:"+s.address);
        }
    }
}
