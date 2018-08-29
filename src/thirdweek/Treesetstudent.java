package thirdweek;

import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

/**
 * Created by expert on 7/12/18.
 */
public class Treesetstudent implements Comparable<Treesetstudent> {
    int rollno;
    String name;
    int age;

    public Treesetstudent(int rollno,String name,int age) {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {

        //Each time the constructor is calling, different objects are creating
        TreeSet<Treesetstudent> obj = new TreeSet<Treesetstudent>();
        obj.add((new Treesetstudent(11, "Jishnu", 23)));
        obj.add((new Treesetstudent(10, "Anju", 11)));
        obj.add((new Treesetstudent(56, "pori", 66)));

        for (Treesetstudent o : obj) {
            System.out.println(o.rollno+" "+o.name+" "+o.age);
        }
    }

        @Override
                public int compareTo(@NotNull Treesetstudent o) {
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
