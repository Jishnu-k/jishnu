package samples;

import java.util.Scanner;

/**
 * Created by expert on 6/28/18.
 */
public class leapy {
    public static void main(String[] args) {
        int c=0;
        Scanner l=new Scanner(System.in);
        int n=l.nextInt();
        if(n%100==0)
            c=1;
        if(c==1) {
            if (n % 400 == 0)
                System.out.println("Leap year");
            else System.out.println("Normal year");
        }
        else
            if(n%4==0)
                System.out.println("Leap year");
            else System.out.println("Normal year");


    }
}
