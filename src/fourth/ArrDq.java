package fourth;

import java.util.ArrayDeque;

/**
 * Created by expert on 7/19/18.
 */
public class ArrDq {
    public static void main(String[] args) {

        ArrayDeque<String> obj=new ArrayDeque<String>();

        obj.add("anju");
        obj.addFirst("anu");
        obj.addLast("alan");
        obj.add("amy");
        obj.add("ammu");
        System.out.println(obj);
        System.out.println("Head "+obj.peek()); //returns first element
        System.out.println("Removed first "+obj.pollFirst()); //remove & return
        //poll: first element & returns null if empty
        System.out.println("Removed last "+obj.pollLast()); //remove & return
        //poll: last element & returns null if empty
        System.out.println("After removal "+obj);
        System.out.println(obj.remove()); //remove first
        System.out.println(obj.removeFirst()); //remove & return (if empty: exception)
        //first element
        System.out.println(obj.removeLast()); //remove & return (if empty: exception)
        //last element
        System.out.println(obj);

    }
}

