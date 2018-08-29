package fourth;

import org.jetbrains.annotations.NotNull;
import thirdweek.Treesetstudent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by expert on 7/16/18.
 */



public class Setstudent implements Comparable<Setstudent> {

   public int rollno;
    String name;
    int age;
    public Setstudent(int rollno,String name,int age) {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<>();
        ArrayList al1=new ArrayList();
        al1.add("abc");
        al1.add(1);
        al1.add(10.0f);
        System.out.println(al1);
        for(Object o:al1){
            System.out.println(o);
        }

        System.out.println();

        HashSet<String> set=new HashSet<>();
        set.add("zzz");
        set.add("111");
        set.add("anju");
        System.out.println(set);

        System.out.println();

        LinkedHashSet<String> linked=new LinkedHashSet<>();
        linked.add("anu");
        linked.add("zzz");
        linked.add("anu");
        System.out.println(linked);

        System.out.println();

        TreeSet<Setstudent> obj=new TreeSet<>();
        obj.add(new Setstudent(11,"athira",77));
        obj.add(new Setstudent(10,"jincy",99));
        obj.add(new Setstudent(13,"fereedha",88));
        for (Setstudent o : obj) {
            System.out.println(o.rollno+" "+o.name+" "+o.age);
        }


    }
    @Override
    public int compareTo(@NotNull Setstudent o) {
        if(rollno>o.rollno){
            return 1;
        }
        else if (rollno<o.rollno){
            return -1;
        }
        else{
            return 0;
        }
    }

}
