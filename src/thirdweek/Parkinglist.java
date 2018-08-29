package thirdweek;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Parkinglist {

    int type,time;
    public Parkinglist(int type,int time){
        this.type=type;
        this.time=time;
    }

    public static void main(String[] args) {
        int s=0, t=0, f=0, ph = 0;
        Scanner sc = new Scanner(System.in);

        while (t != 3 || f != 3)
        {
            System.out.println("Enter type of vehicle");
            int n = sc.nextInt();
            if (n == 2)
                ++t;
            else
                ++f;

            if(t>3 || f>3)
            {
                break;
            }

            System.out.println("Enter parking hours");
            int h = sc.nextInt();

            ArrayList<Integer> al = new ArrayList<>();
            al.add(n);
            al.add(h);
            if (n == 2)
                ph = 25 * h;
            else
                ph = 50 * h;
            al.add(ph);
            for (int obj : al) {
                System.out.println(obj);
            }

        }

        System.out.println("Parking full");
    }
}
