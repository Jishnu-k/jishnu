package samples;
import com.sun.org.apache.xpath.internal.SourceTree;
import onemonth.FirstAnnotation;

import java.util.Scanner;

@FirstAnnotation("11")

public class leap {
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int n=l.nextInt();
        if((n%4==0)&&(n%400==0))
                System.out.println("Leap year");
        else System.out.println("Normal year");

    }
}
