package samples;

import java.util.*;

/**
 * Created by expert on 7/2/18.
 */
public class arraysort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 nos");
        for(int i=0;i<a.length;i++)
        a[i]=s.nextInt();

        for(int i=0;i<5;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }

            }
        }
for(int i=0;i<5;i++)
        System.out.println(a[i]);
    }
}
