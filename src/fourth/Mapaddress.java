package fourth;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by expert on 7/17/18.
 */
public class Mapaddress {

    String pname,hname;
    int hno;

    Mapaddress(int hno,String hname,String pname){
        this.hno=hno;
        this.pname=pname;
        this.hname=hname;
    }

    public static void display(TreeMap<Integer,Mapaddress> t){
        for (Map.Entry<Integer,Mapaddress> obj:t.entrySet()){
            Mapaddress a=(Mapaddress)obj.getValue();
            System.out.println("House number:"+a.hno+" "+"House name:"+a.hname+" "+"Person name:"+a.pname);
        }
    }

    public static void delete(Integer no,TreeMap<Integer,Mapaddress> t){
        for(Map.Entry obj:t.entrySet()){
            if(obj.getKey()==no) {
                t.remove(obj.getKey());
                break;
            }
        }
        display(t);
    }

    public static void update(Integer no,TreeMap<Integer,Mapaddress> t){
        for(Map.Entry obj:t.entrySet()){
            if (obj.getKey()==no) {
                t.put(no, new Mapaddress(2, "hostel", "gopettan"));
                break;
            }
        }
        display(t);
    }

    public static void search(Integer no,TreeMap<Integer,Mapaddress> t){
        for (Map.Entry obj:t.entrySet()){
            if (obj.getKey()==no){
                Mapaddress ma=(Mapaddress)obj.getValue();
                System.out.println("House number:"+ma.hno+" "+"House name:"+ma.hname+" "+"Person name:"+ma.pname);
                break;
            }
        }
    }

    public static void main(String[] args) {
        TreeMap<Integer,Mapaddress> t=new TreeMap<>();
        t.put(1,new Mapaddress(1,"nivas","aswanth"));
        t.put(2,new Mapaddress(2,"villas","reghuvaran"));
        t.put(3,new Mapaddress(3,"bhavanam","akki"));

        display(t);

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter house number to delete");
        int n=sc.nextInt();
        delete(n,t);

        System.out.println("Enter house number to update");
        n=sc.nextInt();
        update(n,t);

        System.out.println("Enter house number to search");
        n=sc.nextInt();
        search(n,t);

    }
}