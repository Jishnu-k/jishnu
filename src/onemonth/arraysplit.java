package onemonth;

import java.util.Scanner;

/**
 * Created by expert on 8/14/18.
 */
public class arraysplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        int a[]=new int[10];
        int f[]=new int[10];
        int l[]=new int[10];
        int j=0;
        int k=0;
        System.out.println("Enter array elemnts");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int mid=size/2;
        System.out.println("mid"+mid);
        for(int i=0;i< size;i++){
            if(i<mid){
                f[j]=a[i];
                j++;
            }
            else{
                l[k]=a[i];
                k++;
            }
        }
        for (int i=0;i<size/2;i++){
            System.out.println(f[i]);
        }
        System.out.println("***********************");
        for (int i=0;i<size/2;i++){
            System.out.println(l[i]);
        }

    }
}
