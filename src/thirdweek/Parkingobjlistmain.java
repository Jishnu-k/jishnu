package thirdweek;

import java.util.ArrayList;

/**
 * Created by expert on 7/11/18.
 */
public class Parkingobjlistmain {

    public static void main(String[] args) {

        Parkingobjlist p1=new Parkingobjlist(2,"101",1);
        Parkingobjlist p2=new Parkingobjlist(2,"102",2);
        Parkingobjlist p3=new Parkingobjlist(2,"103",3);
        Parkingobjlist p4=new Parkingobjlist(2,"101",4);
        Parkingobjlist p5=new Parkingobjlist(4,"105",5);
        Parkingobjlist p6=new Parkingobjlist(4,"106",6);
        Parkingobjlist p7=new Parkingobjlist(4,"107",7);
        Parkingobjlist p8=new Parkingobjlist(4,"107",8);

        ArrayList<Parkingobjlist> parking2=new ArrayList<>();
        Parkingobjlist.addvehicle(parking2,p1);
        Parkingobjlist.addvehicle(parking2,p2);
        Parkingobjlist.addvehicle(parking2,p3);
        Parkingobjlist.display(parking2);
        Parkingobjlist.addvehicle(parking2,p4);

        ArrayList<Parkingobjlist> parking4=new ArrayList<>();
        Parkingobjlist.addvehicle(parking4,p5);
        Parkingobjlist.addvehicle(parking4,p6);
        Parkingobjlist.addvehicle(parking4,p7);
        Parkingobjlist.display(parking4);
        Parkingobjlist.addvehicle(parking4,p8);

        Parkingobjlist.remove(parking2,"101");
        Parkingobjlist.remove(parking4,"107");
        Parkingobjlist.addvehicle(parking2,p4);
        Parkingobjlist.addvehicle(parking4,p8);
        Parkingobjlist.display(parking2);
        Parkingobjlist.display(parking4);

    }
}