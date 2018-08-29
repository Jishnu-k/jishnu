package thirdweek;

import java.util.LinkedList;

/**
 * Created by expert on 7/12/18.
 */
public class Listeg {

    public static void main(String[] args) {

        LinkedList<String> Linked=new LinkedList<>();
        Linked.add("sam");
        Linked.add("anu");
        Linked.addFirst("anju");
        Linked.addLast("bibin");
        Linked.add(null);
        Linked.add(null);
        Linked.remove();
        Linked.remove("anu");


        for (String obj:Linked){
            System.out.println(obj);
        }
    }
}
