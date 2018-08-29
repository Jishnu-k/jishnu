package thirdweek;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listex {

    public static void main(String[] args) {

        //generic declaration
        ArrayList<String> al=new ArrayList<>();
        al.add("jishnu");
        al.add("anju");
        al.add("kummu");
        for(String obj:al){
            System.out.println(obj);
        }

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

        ArrayList<Integer> ali=new ArrayList<>();
        ali.add(1);
        ali.add(2);

        for (int ob:ali)
             {
                 System.out.println(ali);
        }

        Iterator itr=ali.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("*******");

        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(5);
        al2.add(6);

        al2.addAll(1,ali);
        for(int o:al2){
            System.out.println(o);
        }

        al.remove("anju");
        for(String o:al){
            System.out.println(o);
        }


        //List<String> al1=new ArrayList<>();
        //ArrayList<String> al2=new ArrayList<String>();

    }
}
