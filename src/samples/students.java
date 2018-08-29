package samples;

/**
 * Created by expert on 7/3/18.
 */
public class students {

    int id;
    String name;

    public students(int id,String name) {
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {

        students s=new students(1,"anju");
        students s1=new students(2,"jishnu");
        students sarray[]={s,s1};

        for(students obj:sarray) {
            System.out.println(obj + " "); //hash value
            System.out.println(obj.id + " ");
            System.out.println(obj.name + " ");
        }
    }
}
