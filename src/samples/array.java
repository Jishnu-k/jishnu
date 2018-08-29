package samples;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by expert on 7/2/18.
 */
public class array {
    public static void main(String[] args) {              
        int a[]=new int[3];
        int []b={1,2,3};
        int[] c=new int[4];
        c[0]=1;
        c[1]=2;
        c[2]=3;
        c[3]=4;
        int[] d=new int[]{5,9,10,11};
        int len=d.length;
        System.out.println(len);
        for(int i=0;i<len;i++)
            System.out.println(d[i]);

        char ch[]={'a','b','c'};
        String[] str={"one","two","three"};
        for(int i=0;i<str.length;i++)
            System.out.println(str[i]+"");
        for(int i=0;i<ch.length;i++)
            System.out.println(ch[i]+"");

        //for each
        for(String obj:str){
            System.out.println(obj+" ");
        }


    }
}
