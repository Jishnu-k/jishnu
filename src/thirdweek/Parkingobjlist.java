package thirdweek;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Parkingobjlist {
    int type;
    String slotnum;
    int time,ph=0;

    public Parkingobjlist(int type, String slotnum, int time) {
        this.type = type;
        this.slotnum = slotnum;
        this.time = time;
    }

    public static void display(ArrayList<Parkingobjlist> p) {
        for (Parkingobjlist obj : p) {
            if(obj.type==2){
                obj.ph=obj.time*25;
            }
            else
                obj.ph=obj.time*50;
            System.out.println("type:"+obj.type + " slot:" + obj.slotnum + " time:" + obj.time+" fee:"+obj.ph);
        }
    }

    public static void addvehicle(ArrayList<Parkingobjlist> p, Parkingobjlist obj) {
        if (p.size() < 3) {
            p.add(obj);
        } else {
            System.out.println("all slots are occupied");
        }
    }

    public static void remove(ArrayList<Parkingobjlist> p,String sn) {
        for(Parkingobjlist ob:p){
            if(ob.slotnum==sn){
                p.remove(ob);
                break;
            }
        }

    }

}